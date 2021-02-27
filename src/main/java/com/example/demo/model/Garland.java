package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Garland {
    private Light[] lights = null;


    public void setLights(Light[] lights) {
        this.lights = lights;
    }
    
    public Light[] getLights() {
        return lights;
    }
    
    public void turnOn() {
        for (Light light : lights) {
            light.setState("ВКЛ.");
        }
    }
    
}
