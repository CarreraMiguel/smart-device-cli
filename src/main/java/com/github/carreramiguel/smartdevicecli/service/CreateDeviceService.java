package com.github.carreramiguel.smartdevicecli.service;

import com.github.carreramiguel.smartdevicecli.model.SmartPhone;
import com.github.carreramiguel.smartdevicecli.model.SmartWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static com.github.carreramiguel.smartdevicecli.util.ConsoleUtil.readString;
import static com.github.carreramiguel.smartdevicecli.util.ConsoleUtil.readInt;

public class CreateDeviceService {

    private static Logger LOG = LoggerFactory.getLogger(CreateDeviceService.class);
    private static List<SmartPhone> smartPhoneList = new ArrayList<>();
    private static List<SmartWatch> smartWatchList = new ArrayList<>();

    public static void init(String cmd) {
            String[] commandArray = cmd.split(" ");
            if (commandArray.length == 1) {
                LOG.warn("Specify what do you want to create: smart-phone or smart-watch");
                return;
            }

        switch (commandArray[1]) {
            case "smart-phone":
                createSmartPhone();
                break;
            case "smart-watch":
                createSmartWatch();
                break;
            default:
                LOG.warn("Unsupported create command {}", cmd);
        }
    }

    private static void createSmartPhone() {
        LOG.info("Creating new smart phone...");

        String brand = readString("Brand: ");
        String model = readString("Model: ");
        Integer year = readInt("Year: ");
        Boolean has5G = readString("has5G [y/N]: ").equalsIgnoreCase("y");

        SmartPhone smartPhone = new SmartPhone(brand, model, year, has5G);
        smartPhoneList.add(smartPhone);
        LOG.info("LIST: {}", smartPhoneList);
    }

    private static void createSmartWatch() {
        LOG.info("Creating new smart watch");

        String brand = readString("Brand: ");
        String model = readString ("Model: ");
        Integer year = readInt("Year:");
        Boolean healthOptions = readString(" Has healthOptions type Yes or no: ").equalsIgnoreCase("Yes");

        SmartWatch smartWatch = new SmartWatch(brand,model,year,healthOptions);
        smartWatchList.add(smartWatch);
        LOG.info("List: {}", smartWatchList);
    }
}
