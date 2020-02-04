package com.danila.consumerproducer;

import lombok.Getter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class Producer implements Runnable{
    @Override
    public void run() {
        while(true) {
            produce();
        }
    }

    private void produce(){
        synchronized (Store.getStore()) {
            if (Store.getStore().size() < 10) {
                Store.getStore().addFirst(new Random().nextInt());
                System.out.println("Значение отдано");
                try {
                    Store.getStore().wait(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
