package com.example.demoSpringRest.model;

public class Bootcamper {
    private String name;

    public Bootcamper(String name) {
        this.name = name;
    }
    public Bootcamper() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
