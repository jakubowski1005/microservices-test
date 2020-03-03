package com.jakubowskiartur.microservice2.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DeepService {

    public static final String THIRD_MICROSERVICE_SECURED_URL = ".../secured";
    public static final String THIRD_MICROSERVICE_UNSECURED_URL = ".../unsecured";

    private RestTemplate template = new RestTemplate();

    public List<String> getSecuredDataFromThirdMicroservice() {
        @SuppressWarnings("unchecked")
        List<String> data = template.getForObject(THIRD_MICROSERVICE_SECURED_URL, List.class);
        String s1 = "SECURED DATA FROM MICROSERVICE 3 GETS FROM MICROSERVICE 3";
        if(data != null) data.add(0, s1);
        return data;
    }

    public List<String> getUnsecuredDataFromThirdMicroservice() {
        @SuppressWarnings("unchecked")
        List<String> data = template.getForObject(THIRD_MICROSERVICE_UNSECURED_URL, List.class);
        String s1 = "UNSECURED DATA FROM MICROSERVICE 3 GETS FROM MICROSERVICE 3";
        if(data != null) data.add(0, s1);
        return data;
    }
}
