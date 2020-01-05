package com.danila.cycles;

import java.math.BigDecimal;

public class Manhattan {
    public static void main(String[] args) {
        int startYear = 1626;
        BigDecimal addSum = BigDecimal.valueOf(0);
        BigDecimal resultSum = BigDecimal.valueOf(24);
        BigDecimal persent = BigDecimal.valueOf(0.05);

        for (int i = startYear+1; i <= 2020; i++) {
            addSum = persent.multiply(resultSum);
            resultSum = resultSum.add(addSum);

            System.out.println("Year = " + i + " Sum = " + resultSum);
        }
    }
}
