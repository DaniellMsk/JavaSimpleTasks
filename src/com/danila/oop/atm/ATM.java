package com.danila.oop.atm;

public class ATM {
    private int bond20;
    private int bond50;
    private int bond100;

    public ATM(int bond20, int bond50, int bond100) {
        this.bond20 = bond20;
        this.bond50 = bond50;
        this.bond100 = bond100;
    }

    public int getBond20() {
        return bond20;
    }

    public void setBond20(int bond20) {
        this.bond20 = bond20;
    }

    public int getBond50() {
        return bond50;
    }

    public void setBond50(int bond50) {
        this.bond50 = bond50;
    }

    public int getBond100() {
        return bond100;
    }

    public void setBond100(int bond100) {
        this.bond100 = bond100;
    }

    boolean takeCash(int amount) {
        boolean result = false;

        int give100 = 0;
        int give50 = 0;
        int give20 = 0;

        for (int i = 0; i <= bond100; i++) {
            for (int j = 0; j <= bond50; j++) {
                for (int k = 0; k <= bond20; k++) {
                    if (i * 100 + j * 50 + k * 20 == amount) {
                        result = true;
                        give100 = i;
                        give50 = j;
                        give20 = k;
                        break;
                    }
                }
            }
        }

        if (result) {
            System.out.printf("Выданы следующие купюры: \n Сто долларов: %d\n "
                    + "Пятьдесят долларов: %d\n Двадцать долларов: %d\n", give100, give50, give20);
        } else {
            System.out.println("Денег нет, но вы держитесь");
        }

        return result;
    }
}
