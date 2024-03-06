package com.citi.Stationservice.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Train")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "train_ID")
    private Long trainID;
    @Column(name = "train_Number")
    private String trainNumber;
    @Column(name = "train_Name")
    private String trainName;

    @OneToMany(mappedBy = "train")
    private List<Station> stations;

    // Constructors, Getters and Setters
    public Train() {
    }

    public Long getTrainID() {
        return trainID;
    }

    public void setTrainID(Long trainID) {
        this.trainID = trainID;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}




