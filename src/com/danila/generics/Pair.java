package com.danila.generics;

public class Pair <K, V> {
    private K firstValue;
    private V secondValue;

    Pair(K firstValue, V secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public K getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(K firstValue) {
        this.firstValue = firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
