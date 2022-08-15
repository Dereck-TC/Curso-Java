package com.example.demoSpringRest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.example.demoSpringRest.controller");
    }
}
