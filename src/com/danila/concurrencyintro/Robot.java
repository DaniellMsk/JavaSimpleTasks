package com.danila.concurrencyintro;

import java.util.HashMap;
import java.util.Map;

public class Robot {
    private static final Map<String, Integer> robotCounter;
    private String makersName = "";

    static {
        robotCounter = new HashMap<>();
    }

    public Robot(String makersName) {
        this.makersName = makersName;

        synchronized (robotCounter) {
            if (!robotCounter.containsKey(this.makersName)) {
                robotCounter.put(this.makersName, 0);
            }
            robotCounter.put(this.makersName, robotCounter.get(this.makersName) + 1);
        }
    }

    public static Map<String, Integer> getRobotCounter() {
        return robotCounter;
    }
}
