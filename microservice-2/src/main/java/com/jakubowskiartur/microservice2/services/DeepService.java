package com.jakubowskiartur.microservice2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DeepService {

    private RestTemplate template;

    public List<String> getDataFromDeepMicroservice() {
        template.getForObject("/deep", List.class);
    }
}
