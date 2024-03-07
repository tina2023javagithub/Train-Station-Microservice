package com.citi.stationservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.citi.stationservice.entity.Station;

public interface StationRepository extends CrudRepository<Station, Long> {
	 List<Station> findByTrainTrainId(Long trainId);
}
