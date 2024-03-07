package com.citi.trainweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.citi.trainweb.model.TrainIdForm;
import com.citi.trainweb.model.TrainInformationResponse;

@Controller
public class TrainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("trainIdForm", new TrainIdForm());
        return "index";
    }

    
    @GetMapping("/train")
    public String getTrainInformation(@RequestParam("trainId") Long trainId, Model model) {
    	String trainInfoUrl = "http://localhost:8082/train/" + trainId;
    	
    	try {
    	
    	TrainInformationResponse trainInfo = restTemplate.getForObject(trainInfoUrl, TrainInformationResponse.class);
    	System.out.println(trainInfo.getTrain().getTrainName());
        model.addAttribute("trainInfo", trainInfo);
        model.addAttribute("trainIdForm", new TrainIdForm());
    	}catch (Exception e) {
            // Handle TrainNotFoundException
            model.addAttribute("error", "Train not found with id: " + trainId);
        }
        
        
        
        return "index";
    }
}
