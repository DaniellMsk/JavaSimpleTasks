package com.danila.arraylistlinkedlist;

import java.util.ArrayList;

public class RunStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", 24, 4));
        students.add(new Student("Иван", "Шляпкин", 23, 3));
        students.add(new Student("Сергей", "Немчинов", 25, 5));
        students.add(new Student("Георгий", "Карачаев", 19, 4));
        students.add(new Student("Кирилл", "Буренков", 24, 5));
        students.add(new Student("Кирилл", "Буренков", 24, 4));
        students.add(new Student("Кирилл", "Буренков", 22, 4));
        students.add(new Student("Кирилл", "Сасоев", 24, 3));
        students.add(new Student("Сергей", "Кирьянов", 24, 5));
        students.add(new Student("Владислав", "Дракула", 24, 5));
        students.add(new Student("Ивайло", "Богданов", 24, 5));

        System.out.println(students.toString());

        students.sort(new StudentsByNameComparator().thenComparing(new StudentsBySurnameComparator()
                .thenComparing(new StudentsByAgeComparator().thenComparing(new StudentsByMarksComparator().reversed()).reversed())));

        System.out.println(students.toString());
    }
}
