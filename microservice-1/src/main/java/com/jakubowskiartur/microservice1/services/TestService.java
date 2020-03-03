package com.jakubowskiartur.microservice1.services;

import java.util.Arrays;
import java.util.List;

public class TestService {

    public List<String> getUnsecuredData() {
        String s1 = "FIRST UNSECURED DATA FROM MICROSERVICE 1";
        String s2 = "SECOND UNSECURED DATA FROM MICROSERVICE 1";
        String s3 = "THIRD UNSECURED DATA FROM MICROSERVICE 1";
        return Arrays.asList(s1, s2, s3);
    }

    public List<String> getSecuredData() {
        String s1 = "FIRST SECURED DATA FROM MICROSERVICE 1";
        String s2 = "SECOND SECURED DATA FROM MICROSERVICE 1";
        String s3 = "THIRD SECURED DATA FROM MICROSERVICE 1";
        return Arrays.asList(s1, s2, s3);
    }
}
