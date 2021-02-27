package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Garland;
import com.example.demo.model.Light;

@RestController
@RequestMapping("/")
public class GarlandController {
	Garland garland;
	
	public GarlandController(Garland garland, Light light) {
		this.garland = garland;
		light.setState("Зеленый включен");
		Light[] lights = {light, light};
		garland.setLights(lights);
	}
	
	@RequestMapping(value = "/rest/garland", method = RequestMethod.GET)
    public Garland pageVisit() {
		return garland;
	}
}
