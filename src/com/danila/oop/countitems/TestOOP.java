package com.danila.oop.countitems;

import com.danila.oop.countitems.CountedItem;

public class TestOOP {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new CountedItem();
        }

        CountedItem countedItem = new CountedItem();

        System.out.println(countedItem.getId());
    }
}
