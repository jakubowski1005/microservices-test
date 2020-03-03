package com.jakubowskiartur.microservice1.controllers;

import com.jakubowskiartur.microservice1.services.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private TestService service;

    @GetMapping("/unsecured")
    public List<String> getUnsecuredData() {
        return service.getUnsecuredData();
    }

    @GetMapping("/secured")
    public List<String> getSecuredData() {
        return service.getSecuredData();
    }
}
