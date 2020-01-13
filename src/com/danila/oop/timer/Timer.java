package com.danila.oop.timer;

public class Timer {
    private int hours;
    private int minutes;
    private int seconds;

    public Timer(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Timer(int seconds) {
        this.hours = seconds / 60 / 60;
        this.minutes = seconds / 60 % 60;
        this.seconds = seconds % 60;
    }

    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public void printTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
