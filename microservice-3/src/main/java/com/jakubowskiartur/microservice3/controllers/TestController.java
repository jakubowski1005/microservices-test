package com.jakubowskiartur.microservice3.controllers;

import com.jakubowskiartur.microservice3.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping("/unsecured")
    public List<String> unsecuredData() {
        return service.unsecuredData();
    }

    @GetMapping("/secured")
    public List<String> securedData() {
        return service.securedData();
    }
}
