package com.citi.trainweb.model;

import java.util.List;


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
