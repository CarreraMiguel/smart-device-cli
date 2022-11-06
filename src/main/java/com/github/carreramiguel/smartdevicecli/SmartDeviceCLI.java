package com.github.carreramiguel.smartdevicecli;

import com.github.carreramiguel.smartdevicecli.model.SmartDevice;
import com.github.carreramiguel.smartdevicecli.model.SmartPhone;
import com.github.carreramiguel.smartdevicecli.util.Command;

import static com.github.carreramiguel.smartdevicecli.util.ConsoleUtil.*;

public class SmartDeviceCLI {

    public static void main(String[] args) {
        message("Welcome to Smart Device CLI. Write 'help' to get a list of available commands");

        while (true) {
            Command.readCommand(readString());
        }
    }

}
