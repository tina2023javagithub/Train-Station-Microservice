package com.citi.Stationservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.citi.Stationservice.entity.Station;

public interface StationRepository extends CrudRepository<Station, Long> {

}
