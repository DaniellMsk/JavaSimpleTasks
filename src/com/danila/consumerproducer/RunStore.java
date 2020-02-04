package com.danila.consumerproducer;

public class RunStore {
    public static void main(String[] args) {
        Store store = new Store();

        Thread consumer = new Thread(new Consumer());
        Thread producer = new Thread(new Producer());

        consumer.start();
        producer.start();

        try {
            consumer.join();
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
