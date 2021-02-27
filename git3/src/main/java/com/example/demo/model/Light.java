package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Light {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
