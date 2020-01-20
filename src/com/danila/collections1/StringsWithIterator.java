package com.danila.collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class StringsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> stringsForIter = new ArrayList<>();

        stringsForIter.add("Первая");
        stringsForIter.add("Пер");
        stringsForIter.add("Вторая");
        stringsForIter.add("Втор");
        stringsForIter.add("Третья");
        stringsForIter.add("Тр");
        stringsForIter.add("Четвёртая");
        stringsForIter.add("Пятая");
        stringsForIter.add("Пят");

        System.out.println(stringsForIter.toString());

        Iterator<String> iter = stringsForIter.iterator();

        while (iter.hasNext()) {
            if (iter.next().length() > 4) {
                iter.remove();
            }
        }

        System.out.println(stringsForIter.toString());

        stringsForIter.clear();

        stringsForIter.add("Первая");
        stringsForIter.add("Пер");
        stringsForIter.add("Вторая");
        stringsForIter.add("Втор");
        stringsForIter.add("Третья");
        stringsForIter.add("Тр");
        stringsForIter.add("Четвёртая");
        stringsForIter.add("Пятая");
        stringsForIter.add("Пят");

        stringsForIter.removeIf(s -> s.length() > 4);

        System.out.println(stringsForIter.toString());

    }
}
