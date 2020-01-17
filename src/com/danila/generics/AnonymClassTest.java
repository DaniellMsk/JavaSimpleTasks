package com.danila.generics;

import com.danila.oop.timer.Timer;

public class AnonymClassTest {
    public static void main(String[] args) {
        int allSeconds = new Timer(0){
            public void setDays(int days){
                super.setHours(24*days);
            }

            @Override
            public int getTotalSeconds() {
                setDays(1);
                return super.getTotalSeconds();
            }
        }.getTotalSeconds();

        System.out.println(allSeconds);
    }
}
