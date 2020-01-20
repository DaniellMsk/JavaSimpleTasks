package com.danila.collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class MarkLength {
    public static void main(String[] args) {
        ArrayList<String> markingStrings = new ArrayList<>();
        markingStrings.add("this");
        markingStrings.add("is");
        markingStrings.add("lots");
        markingStrings.add("of");
        markingStrings.add("fun");
        markingStrings.add("for");
        markingStrings.add("every");
        markingStrings.add("Java");
        markingStrings.add("programmer");

        System.out.println(markingStrings.toString());

        for (int i = 0; i < markingStrings.size(); i++) {
            if(markingStrings.get(i).length() == 4) {
                markingStrings.add(i, "****");
                i++;
            }
        }

        System.out.println(markingStrings.toString());
    }

}
