package com.citi.trainservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.citi.trainservice.entity.Train;

public interface TrainRepository extends CrudRepository<Train, Long> {
}
