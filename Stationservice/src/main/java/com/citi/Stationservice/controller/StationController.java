package com.citi.Stationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citi.Stationservice.entity.Station;
import com.citi.Stationservice.service.StationService;



@RestController
public class StationController {
	
	@Autowired
	StationService stationService;
	
	@GetMapping("/stations")
	public ResponseEntity<List<Station>> getAllStation() {
		List<Station> stations = stationService.getAllStation();
		System.out.println("1");
		return ResponseEntity.ok(stations);
	}
}