package com.jakubowskiartur.microservice2.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TestService {

    public List<String> unsecuredData() {
        String s1 = "FIRST VALUE FROM MICROSERVICE 2";
        String s2 = "SECOND VALUE FROM MICROSERVICE 2";
        String s3 = "THIRD VALUE FROM MICROSERVICE 2";
        return Arrays.asList(s1, s2, s3);
    }

    public List<String> securedData() {
        String s1 = "FIRST VALUE FROM MICROSERVICE 2";
        String s2 = "SECOND VALUE FROM MICROSERVICE 2";
        String s3 = "THIRD VALUE FROM MICROSERVICE 2";
        return Arrays.asList(s1, s2, s3);
    }
}