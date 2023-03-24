package com.personal.security.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MethodService {


    private final RestTemplate restTemplate;

    public MethodService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callExternalService() {
        String externalServiceUrl = "http://localhost:8082//api-method/v1/methods";
        String response = restTemplate.getForObject(externalServiceUrl, String.class);
        return response;
    }
}
