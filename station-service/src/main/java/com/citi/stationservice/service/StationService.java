package com.citi.stationservice.service;

import java.util.List;

import com.citi.stationservice.entity.Station;

public interface StationService {
	List <Station> getAllStation();
	List<Station> getStationsByTrainId(Long trainId);
}
