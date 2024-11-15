package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;

public class CarRepository {
    private final Car[] cars = new Car[4];

    public CarRepository() {
        this.cars[0] = new Car("Toyota", "Corolla", 2020, 300.0, "Black", "KR11");
        this.cars[1] = new Car("Honda", "Civic", 2022, 400.0, "Red", "KR22");
        this.cars[2] = new Car("BMW", "3", 2019, 350.0, "Blue", "KR33");
        this.cars[3] = new Car("Kia", "Ceed", 2015, 200.0, "Yellow", "KR44");
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(!car.isRent() && car.getPlate().equals(plate)) {
                car.setRent(true);
                return true;
            }
        }
        return false;
    }

    public Car[] getCars() {
        return cars;
    }
}
