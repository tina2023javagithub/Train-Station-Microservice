package com.citi.stationservice.model;

import com.citi.stationservice.entity.Train;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class StationDto {
	private Long stationId;
    private String stationName;
    private String trainNumber;
    private String traingName;
}
