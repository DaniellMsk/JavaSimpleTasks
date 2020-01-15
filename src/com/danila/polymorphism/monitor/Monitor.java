package com.danila.polymorphism.monitor;

public class Monitor {
    private int connectedDevices;

    public void connectDevice(String device) {
        System.out.println(device + " connected!");
        connectedDevices++;
    }

    public void diagnose() {
        if (connectedDevices == 3) {
            System.out.println("Диагностика проведена успешно! Всё работает");
        } else {
            System.out.println("Что-то идёт не так");
        }
    }
}
