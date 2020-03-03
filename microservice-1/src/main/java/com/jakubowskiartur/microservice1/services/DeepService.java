package com.jakubowskiartur.microservice1.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DeepService {

    public static final String THIRD_MICROSERVICE_UNSECURED_URL = "xyz/unsecured";
    public static final String THIRD_MICROSERVICE_SECURED_URL = "xyz/secured";

    private RestTemplate restTemplate = new RestTemplate();

    public List<?> getUnsecuredDataFromThirdService() {
        @SuppressWarnings("unchecked")
        List<String> data = restTemplate.getForObject(THIRD_MICROSERVICE_UNSECURED_URL, List.class);
        String s1 = "MICROSERVICE 1 GET UNSECURED DATA FROM MICROSERVICE 3";
        if(data != null) data.add(0, s1);
        return data;
    }

    public List<?> getSecuredDataFromThirdService() {
        @SuppressWarnings("unchecked")
        List<String> data = restTemplate.getForObject(THIRD_MICROSERVICE_SECURED_URL, List.class);
        String s1 = "MICROSERVICE 1 GET SECURED DATA FROM MICROSERVICE 3";
        if(data != null) data.add(0, s1);
        return data;
    }
}