package com.github.carreramiguel.smartdevicecli.model;

import lombok.Data;

import java.util.Objects;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartDevice)) return false;
        SmartDevice that = (SmartDevice) o;
        return Objects.equals(brand, that.brand) &&
                Objects.equals(model, that.model) &&
                Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
