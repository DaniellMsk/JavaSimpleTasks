package com.danila.consumerproducer;

import lombok.Getter;

@Getter
public class Consumer implements Runnable {
    @Override
    public void run() {
        while (true) {
            consume();
        }
    }

    private void consume(){
        synchronized (Store.getStore()) {
            if (!Store.getStore().isEmpty()) {
                Store.getStore().removeFirst();
                System.out.println("Значение принято");
                try {
                    Store.getStore().wait(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
