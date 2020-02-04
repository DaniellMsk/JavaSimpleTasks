package com.danila.concurrencyintro;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RandomUtil {
    public static int getRandom(int bound) {
        Random random = new Random();

        return random.nextInt(bound);
    }
}
