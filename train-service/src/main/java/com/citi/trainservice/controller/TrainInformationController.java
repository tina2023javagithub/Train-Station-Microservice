package com.citi.trainservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.citi.trainservice.entity.Train;
import com.citi.trainservice.exception.TrainNotFoundException;
import com.citi.trainservice.model.Station;
import com.citi.trainservice.model.TrainInformationResponse;
import com.citi.trainservice.repository.TrainRepository;

@RestController
public class TrainInformationController {

    private final TrainRepository trainRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public TrainInformationController(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @GetMapping("/train/{trainId}")
    public ResponseEntity<TrainInformationResponse> getTrainInformation(@PathVariable Long trainId) {
        Train train = trainRepository.findById(trainId)
                                     .orElseThrow(() -> new TrainNotFoundException("Train not found with id: " + trainId));

        String stationDetailsUrl = "http://localhost:8081/stations/" + trainId;
        Station[] stations = restTemplate.getForObject(stationDetailsUrl, Station[].class);

        return ResponseEntity.ok(new TrainInformationResponse(train, Arrays.asList(stations)));
    }

}

