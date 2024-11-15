package com.comarch.szkolenia.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private String plate;
    private boolean rent = false;

    public Car(String brand, String model, int year, double price, String color, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.plate = plate;
    }

    public Car() {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getBrand())
                .append(" ")
                .append(this.getModel())
                .append(" Rok: ")
                .append(this.getYear())
                .append(" Cena: ")
                .append(this.getPrice())
                .append(" Kolor: ")
                .append(this.getColor())
                .append(" Nr rejestracyjny: ")
                .append(this.getPlate())
                .append(" ")
                .append(this.isRent() ? "Not available" : "Available")
                .toString();
    }
}
