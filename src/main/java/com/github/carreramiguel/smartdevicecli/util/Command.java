package com.github.carreramiguel.smartdevicecli.util;


import com.github.carreramiguel.smartdevicecli.service.CreateDeviceService;

import static com.github.carreramiguel.smartdevicecli.util.ConsoleUtil.*;

public class Command {

    public static void readCommand(String cmd) {
        switch (cmd.split(" ")[0]) {
            case "help":
                showHelpMessage();
                break;
            case "quit":
                message("Bye!");
                System.exit(0);
                break;
            case "create":
                CreateDeviceService.init(cmd);
                break;
            default:
                message("Unknown command: '" + cmd + "'. Showing available commands.\n");
                showHelpMessage();
        }
    }

    private static void showHelpMessage() {
        message("create -> create new smart device\n" +
                "help -> show this image\n" +
                "quit -> exit");
    }
}
