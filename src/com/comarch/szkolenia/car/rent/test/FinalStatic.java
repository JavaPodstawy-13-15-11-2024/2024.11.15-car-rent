package com.comarch.szkolenia.car.rent.test;

import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.model.Car;

import java.io.*;

public class FinalStatic {
    public static void main(String[] args) throws IOException {
        final int x = 7;

        final Car car = new Car("Toyota", "Corolla", 2020, 300.0, "Black", "KR11");
        System.out.println(car.getBrand());
        car.setBrand("Cos");
        System.out.println(car.getBrand());

        double PI = 3.14;
        String SERVER_IP = "123.123.123.123";

        GUI gui = new GUI();
        //gui.showMenuAndReadChoose();

        System.out.println(StaticExample.x);

        StaticExample se1 = new StaticExample();
        StaticExample se2 = new StaticExample();

        System.out.println(StaticExample.x);
        System.out.println(se1.x);
        System.out.println(se2.x);

        se1.x = 10;

        System.out.println(StaticExample.x);
        System.out.println(se1.x);
        System.out.println(se2.x);

        /*String file ="src/test/resources/fileTest.txt";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();


        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        writer.write(str);
        writer.write("cos innego");
        writer.newLine();
        writer.write("kolejna linia /n");

        writer.close();*/
    }
}
