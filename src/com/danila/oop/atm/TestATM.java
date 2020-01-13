package com.danila.oop.atm;

public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM(25, 20, 10);
        atm.takeCash(1190);
    }
}
