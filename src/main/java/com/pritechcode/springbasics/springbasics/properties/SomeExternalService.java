package com.pritechcode.springbasics.springbasics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
    
    @Value("${external.service.url}")
    private String url;

    public String getServiceUrl(){
        return url;
    }
}
