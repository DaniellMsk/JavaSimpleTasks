package com.danila.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class PersonStream {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Иванов", "Андрей", 23));
        persons.add(new Person("Петров", "Сидор", 55));
        persons.add(new Person("Чванчалич", "Приндердорович", 30));
        persons.add(new Person("Финтех", "Свантовский", 33));
        persons.add(new Person("Саня", "Бегемот", 18));
        persons.add(new Person("Костя", "Сошка", 19));
        persons.add(new Person("Аня", "Пелуга", 22));
        persons.add(new Person("Сесилия", "Арантамович", 19));
        persons.add(new Person("Феня", "Сиплый", 35));
        persons.add(new Person("Мойкрофт", "Фергюссон", 38));

        OptionalInt max = persons.stream()
                .filter(it -> (it.getFirstName() + it.getLastName()).length() > 15)
                .map(Person::getAge)
                .mapToInt(Integer::valueOf)
                .max();

        System.out.println("Максимальный возраст среди тех, чьё имя и фамилия длиннее 15 символов: " + max.getAsInt());
    }
}
