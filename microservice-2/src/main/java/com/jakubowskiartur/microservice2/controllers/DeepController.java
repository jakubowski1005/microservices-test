package com.jakubowskiartur.microservice2.controllers;

import com.jakubowskiartur.microservice2.services.DeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeepController {

    private DeepService service;

    @Autowired
    public DeepController(DeepService service) {
        this.service = service;
    }

    @GetMapping("deep-secured")
    public List<String> getSecuredDataFromThirdMicroservice() {
        return service.getSecuredDataFromThirdMicroservice();
    }

    @GetMapping("deep-unsecured")
    public List<String> getUnsecuredDataFromThirdMicroservice() {
        return service.getUnsecuredDataFromThirdMicroservice();
    }
}
