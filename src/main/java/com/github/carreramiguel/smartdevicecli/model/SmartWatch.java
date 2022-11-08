package com.github.carreramiguel.smartdevicecli.model;

public class SmartWatch extends SmartDevice {

    private Boolean healthOptions;

    public SmartWatch(String brand, String model, Integer year, Boolean healthOptions) {
        super(brand, model, year);
        this.healthOptions = healthOptions;
    }

    public Boolean getHealthOptions() {
        return healthOptions;
    }

    public void setHealthOptions(Boolean healthOptions) {
        this.healthOptions = healthOptions;
    }
}
