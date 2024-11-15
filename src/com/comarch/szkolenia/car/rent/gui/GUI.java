package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    private static final Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static void listCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(car);
        }
    }

    public static String askForPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    public static void showWrongChooseMessage() {
        System.out.println("Wrong choose");
    }
}
