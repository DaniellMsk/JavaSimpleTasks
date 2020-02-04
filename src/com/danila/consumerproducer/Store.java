package com.danila.consumerproducer;

import lombok.Getter;

import java.util.Deque;
import java.util.LinkedList;

public class Store {
    private static final int MAX_SIZE = 10;
    private static final Deque<Integer> store = new LinkedList<>();

    public static Deque<Integer> getStore() {
        return store;
    }
}
