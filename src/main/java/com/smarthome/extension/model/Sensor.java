package com.smarthome.extension.model;

public class Sensor {

    Integer id;
    boolean state;
    String description;
    String name;

    public Sensor(String name, boolean state, String description) {
        this.name = name;
        this.state = state;
        this.description = description;

    }

    public Sensor(String name, boolean state) {
        this.state = state;
        this.name = name;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
