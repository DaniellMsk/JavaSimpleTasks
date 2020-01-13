package com.danila.oop.timer;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer1 = new Timer(15, 16, 24);
        Timer timer2 = new Timer(4525);

        System.out.println(timer2.getTotalSeconds());

        timer1.printTime();
        timer2.printTime();
    }
}
