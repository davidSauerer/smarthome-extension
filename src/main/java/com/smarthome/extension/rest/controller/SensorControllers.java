package com.smarthome.extension.rest.controller;

import com.smarthome.extension.model.Sensor;
import com.smarthome.extension.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/sensors")
public class SensorControllers {

    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(SensorControllers.class);
    @Autowired
    SensorService sensorService;

    @GetMapping("/{id}")
    public Sensor readSensor(@PathVariable(name = "id") int id) {
        logger.debug("Sensor requested with ID: {}", id);
        return sensorService.getSensorById(id);
}

    @GetMapping("/")
    public List<Sensor> readSensor() {
        logger.debug("Sensors are requested");
        return sensorService.getSensors();
    }


}
