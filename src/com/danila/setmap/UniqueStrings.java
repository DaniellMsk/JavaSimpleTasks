package com.danila.setmap;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueStrings {
    public static void main(String[] args) {
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("First", "First");
        stringHashMap.put("Second", "Second");
        stringHashMap.put("Third", "First");
        System.out.println(isUnique(stringHashMap));
    }

    public static boolean isUnique(HashMap<String, String> stringHashMap) {
        return new HashSet<String>(stringHashMap.values()).size() == stringHashMap.values().size();
    }
}
