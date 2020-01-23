package com.danila.setmap;

public class GarageRun {
    public static void main(String[] args) {
        Car car1 = new Cargo("Камаз", "Первый", 1996, "Синий", "Бензин", 5);
        Car car2 = new Cargo("Камаз", "Второй", 1998, "Красный", "Дизель", 10);
        Car car3 = new RaceCar("Опель", "Пацанский", 2010, "Красный", "Бензин", 250);
        Car car4 = new RaceCar("Феррари", "Клёвый", 2018, "Жёлтый", "Бензин",310);
        Car car5 = new RaceCar("Бентли", "Дорогущий", 2017, "Чёрный", "Бензин",300);
        Car car6 = new SpecialCar("Погрузчик", "Складской", 2017, "Чёрный", "Бензин", "Разгрузка");
        Car car7 = new SpecialCar("Погрузчик", "Складской", 2017, "Чёрный", "Бензин", "Загрузка");
        Car car8 = new Taxi("Опель", "Пацанский", 2010, "Жёлтый", "Бензин", 4);
        Car car9 = new Taxi("Рино", "Пацанский", 2015, "Жёлтый", "Бензин", 5);

        Garage garage = new Garage();

        garage.enter(car1);
        garage.enter(car3);
        garage.enter(car1);
        garage.enter(car1);
        garage.enter(car6);
        garage.enter(car5);
        garage.enter(car9);

        garage.leave(car1);
        garage.leave(car1);
        garage.leave(car3);
        garage.leave(car2);
        garage.leave(car9);
        garage.leave(car6);
        garage.leave(car5);
    }
}
