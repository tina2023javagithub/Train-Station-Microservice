package com.citi.stationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StationServiceApplication.class, args);
	}
}
