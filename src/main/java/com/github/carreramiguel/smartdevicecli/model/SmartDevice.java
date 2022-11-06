package com.github.carreramiguel.smartdevicecli.model;

import lombok.Data;

@Data
public abstract class SmartDevice {
    private String brand;
    private String model;
    private Integer year;

    public SmartDevice(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
