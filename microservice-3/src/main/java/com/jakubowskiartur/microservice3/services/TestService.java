package com.jakubowskiartur.microservice3.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TestService {

    public List<String> securedData() {
        String s1 = "FIRST SECURED DATA FROM MICROSERVICE 3";
        String s2 = "SECOND SECURED DATA FROM MICROSERVICE 3";
        String s3 = "THIRD SECURED DATA FROM MICROSERVICE 3";
        return Arrays.asList(s1, s2, s3);
    }

    public List<String> unsecuredData() {
        String s1 = "FIRST UNSECURED DATA FROM MICROSERVICE 3";
        String s2 = "SECOND UNSECURED DATA FROM MICROSERVICE 3";
        String s3 = "THIRD UNSECURED DATA FROM MICROSERVICE 3";
        return Arrays.asList(s1, s2, s3);
    }
}
