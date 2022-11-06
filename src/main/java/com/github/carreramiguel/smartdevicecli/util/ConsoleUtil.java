package com.github.carreramiguel.smartdevicecli.util;

import java.io.Console;
import java.util.Scanner;

public class ConsoleUtil {

    private final static Scanner scanner = new Scanner(System.in);

    public static void message(String message) {
        System.out.println(message);
    }

    public static String readString() {
        System.out.print("_> ");
        return scanner.nextLine();
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Integer readInt(String message) {
        System.out.print(message);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No valid number");
            return null;
        }
    }

    public static Double readDouble(String message) {
        System.out.print(message);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No valid number");
            return null;
        }
    }

    public static Float readFloat(String message) {
        System.out.print(message);
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("No valid number");
            return null;
        }
    }
}
