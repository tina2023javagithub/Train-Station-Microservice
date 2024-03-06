package com.citi.Stationservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citi.Stationservice.entity.Station;
import com.citi.Stationservice.repository.StationRepository;

@Service
public class StationServiceImpl implements StationService {


		@Autowired
		StationRepository stationRepository;
		
		
		@Override
		public List<Station> getAllStation() {
			List<Station> stationList = new ArrayList<Station> ();
			stationRepository.findAll().forEach(station -> stationList.add(station));
			
			Iterable<Station> stationList1 = stationRepository.findAll();
			stationList1.forEach((p) -> {
	            System.out.println(p.getStationName());
	        });

	        
//	        
//			for(int i=0; i< stationList.size(); i++) {
//				System.out.println(stationList.get(i).getStationID());
//				System.out.println(stationList.get(i).getStationName());
//			}
			
			
			System.out.println("station size - " + stationList.size());
			
			return stationList;
		}
}

