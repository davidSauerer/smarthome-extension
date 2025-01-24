package com.smarthome.extension.service;

import com.smarthome.extension.model.Sensor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SensorService {
    private final List<Sensor> sensors;

    public SensorService() {
       this.sensors = new ArrayList<>();
       addSensor(new Sensor("Heartbeat", true, "Shows if service is reacting"));
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public int addSensor(Sensor sensor){
        sensor.setId(sensors.size());
        sensors.add(sensor);
        return sensors.size();
    }

    public Sensor getSensorById(int id){
        return sensors.get(id);
    }

}
