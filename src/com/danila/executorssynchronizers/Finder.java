package com.danila.executorssynchronizers;

import java.util.concurrent.Callable;

public class Finder implements Callable {

    private int [] values;
    private int start;

    public Finder(int[] values, int start) {
        this.values = values;
        this.start = start;
    }

    @Override
    public Integer call() throws Exception {
        int max = 0;
        for (int i = start; i < start + values.length / 10; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        System.out.println("Поиск выполняется в потоке номер " + start + ", Максимальное значение по потоку: " + max);
        return max;
    }
}
