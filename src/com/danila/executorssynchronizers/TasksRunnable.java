package com.danila.executorssynchronizers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TasksRunnable implements Runnable {

    private int seconds;

    public TasksRunnable(int seconds){
        this.seconds = seconds;
    }

    @Override
    public void run() {
        System.out.println("Собираюсь спать " + seconds + " секунд");
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Спал " + seconds + " секунд");
    }
}
