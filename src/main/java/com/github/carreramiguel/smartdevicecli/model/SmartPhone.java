package com.github.carreramiguel.smartdevicecli.model;

import lombok.Data;

@Data
public class SmartPhone extends SmartDevice {

    public SmartPhone(String brand, String model, Integer year) {
        super(brand, model, year);
    }

    public SmartPhone() {
        super(null, null, null);
    }
}
