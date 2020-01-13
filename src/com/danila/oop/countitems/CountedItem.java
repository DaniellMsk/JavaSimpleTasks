package com.danila.oop.countitems;

public class CountedItem {
    private static int counter = 0;

    private int id;

    {
        ++counter;
    }

    public CountedItem(){
        this.id = this.counter;
    }

    public int getId() {
        return id;
    }

}
