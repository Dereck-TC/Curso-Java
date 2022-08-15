package com.example.demoSpringRest.services;

import com.example.demoSpringRest.model.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private final List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getBootcamper() {
        return bootcampers;
    }
    public void add(Bootcamper b){
        bootcampers.add(b);
    }
}
