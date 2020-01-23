package com.danila.setmap;

import java.util.HashMap;

public class Garage {
    HashMap<Car, Integer> cars;

    public Garage() {
        cars = new HashMap<Car, Integer>();
    }

    public void enter(Car car){
        if(cars.containsKey(car)) {
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
        System.out.println("Приехала машина " + car.getMark() + " " + car.getColor()
                + " Сейчас в гараже " + cars.get(car) + " таких машин");
    }

    public void leave(Car car){
        if(cars.containsKey(car)) {
            cars.put(car, cars.get(car) - 1);
            System.out.println("Уехала машина " + car.getMark() + " " + car.getColor()
                    + " Сейчас в гараже " + cars.get(car) + " таких машин");
        } else {
            System.out.println("Нет таких машин!");;
        }
    }

    public int getAmountOfCars(Car car){
     return cars.getOrDefault(car, 0);
    }
}
