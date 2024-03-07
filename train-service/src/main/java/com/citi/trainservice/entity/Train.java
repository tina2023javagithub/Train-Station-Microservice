package com.citi.trainservice.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trains")
public class Train {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainId;
    
    @Column(name = "train_number", nullable = false)
    private String trainNumber;
    
    @Column(name = "train_name", nullable = false)
    private String trainName;
}
