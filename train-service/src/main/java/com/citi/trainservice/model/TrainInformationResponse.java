package com.citi.trainservice.model;

import java.util.List;

import com.citi.trainservice.entity.Train;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class TrainInformationResponse {
    private Train train;
    private List<Station> stations;
    
    public TrainInformationResponse(Train train, List<Station> stations) {
    	this.train = train;
    	this.stations = stations;
    }
}
