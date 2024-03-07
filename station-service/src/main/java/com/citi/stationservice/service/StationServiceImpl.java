package com.citi.stationservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.stationservice.entity.Station;
import com.citi.stationservice.repository.StationRepository;

@Service
public class StationServiceImpl implements StationService {

	@Autowired
	StationRepository stationRepository;
	
	@Override
	public List<Station> getAllStation() {
		List<Station> stationList = new ArrayList<Station> ();
		stationRepository.findAll().forEach(station -> stationList.add(station));
		
		System.out.println("station size - " + stationList.size());
		
		return stationList;
	}

	@Override
	public List<Station> getStationsByTrainId(Long trainId){
		return stationRepository.findByTrainTrainId(trainId);
	}

}
