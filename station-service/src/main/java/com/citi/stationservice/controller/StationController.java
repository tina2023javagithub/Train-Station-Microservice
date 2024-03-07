package com.citi.stationservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citi.stationservice.entity.Station;
import com.citi.stationservice.model.StationDto;
import com.citi.stationservice.service.StationService;

@RestController
public class StationController {
	
	@Autowired
	StationService stationService;
	
	@GetMapping("/stations")
	public ResponseEntity<List<Station>> getAllStation() {
		List<Station> stations = stationService.getAllStation();
		
		System.out.println("Size - " + stations.size());
		
		return ResponseEntity.ok(stations);
	}
	
	@GetMapping("/stations/{trainId}")
    public ResponseEntity<List<StationDto>> getStationsByTrainId(@PathVariable Long trainId) {
		
		List<Station> stationList = stationService.getStationsByTrainId(trainId);
		
		List<StationDto> response = new ArrayList<StationDto>();
		
		for(int i= 0 ; i< stationList.size(); i++) {
			StationDto station = new StationDto();
			station.setStationId(stationList.get(i).getStationId());
			station.setStationName(stationList.get(i).getStationName());
			station.setTrainNumber(stationList.get(i).getTrain().getTrainNumber());
			station.setTraingName(stationList.get(i).getTrain().getTrainName());
			response.add(station);
		}
		
        return ResponseEntity.ok(response);
    }
}
