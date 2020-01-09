package com.danila.arrays;

import java.util.Arrays;

public class Butterfly {
    public static void main(String[] args) {
        char [][] butterfly = {
            { '1', '1', '1', '1', '1'},
            { '0', '1', '1', '1', '0'},
            { '0', '0', '1', '0', '0'},
            { '0', '1', '1', '1', '0'},
            { '1', '1', '1', '1', '1'}
        };

        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                if ((butterfly[i][j] == '0')) {
                    butterfly[i][j] = ' ';
                } else {
                    butterfly[i][j] = '*';
                }
            }
        }


        for (char[] chars : butterfly) {
            System.out.println(Arrays.toString(chars).replace(',', ' '));
        }
    }
}
