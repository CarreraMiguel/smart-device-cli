package com.github.carreramiguel.smartdevicecli.model;

import java.util.Objects;

public class SmartPhone extends SmartDevice {

    private Boolean has5G;

    public SmartPhone(String brand, String model, Integer year, Boolean has5G) {
        super(brand, model, year);
        this.has5G = has5G;
    }

    public Boolean getHas5G() {
        return has5G;
    }

    public void setHas5G(Boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return Objects.equals(has5G, that.has5G);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), has5G);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand=" + getBrand() + ", " +
                "model=" + getModel() + ", " +
                "year=" + getYear() + ", " +
                "has5G=" + getHas5G() +
                '}';
    }
}
