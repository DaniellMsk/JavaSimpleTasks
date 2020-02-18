package com.danila.regularexpressions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
    public static StringBuffer getResultSchedule(String data) {
        String regex = "(\\d{2}:\\d{2})(.*?)\r\n(\\d{2}:\\d{2})(.*?)\r\n";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        StringBuffer stringBufferTimes = new StringBuffer();
        StringBuffer stringBufferActivities = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(stringBufferTimes, "$1-$3 $2\r\n$3-$4\r\n");
        }
        matcher.appendTail(stringBufferTimes);

        regex = "(\\d{2}:\\d{2})-(.*?)\r\n(\\d{2}:\\d{2})-(\\d{2}:\\d{2})(.*?)\r\n";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringBufferTimes.toString());

        while(matcher.find()){
            matcher.appendReplacement(stringBufferActivities, "$1-$3 $2\r\n$3-$4$5\r\n");
        }
        matcher.appendTail(stringBufferActivities);

        regex = "(\\d{2}:\\d{2}-)(.*?)\r\n(\\d{2}:\\d{2})(.*?)(\r\n\r\n|$)";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringBufferActivities.toString());

        stringBufferTimes = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(stringBufferTimes, "$1$3 $2\r\n$3 Конец$5");
        }
        matcher.appendTail(stringBufferTimes);

        regex = "(\\d{2}:\\d{2}-\\d{2}:\\d{2})( \\d{2}:\\d{2})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(stringBufferTimes.toString());

        stringBufferActivities = new StringBuffer();

        while(matcher.find()){
            matcher.appendReplacement(stringBufferActivities, "$1");
        }
        matcher.appendTail(stringBufferActivities);
        return stringBufferActivities;
    }

    public static String getString(StringBuffer stringBufferActivities) {
        String resultString = "";

        String [] days = stringBufferActivities.toString().split("Конец");

        String regex = "(\\d{2}):(\\d{2})-(\\d{2}):(\\d{2})[ ](.*?)\r";


        Pattern pattern = Pattern.compile(regex);

        int result = 0;

        for (int i = 0; i < days.length; i++) {

            Map<String, Integer> hashMap = new HashMap<>();

            hashMap.put("Упражнения", 0);
            hashMap.put("Решения", 0);
            hashMap.put("Перерывы", 0);
            hashMap.put("Лекции", 0);

            Matcher matcher = pattern.matcher(days[i]);

            while (matcher.find()){
                result = Integer.parseInt(matcher.group(3))*60 + Integer.parseInt(matcher.group(4))
                        - (Integer.parseInt(matcher.group(1))*60 + Integer.parseInt(matcher.group(2)));

                if (matcher.group(5).trim().contains("Упражнения")) {
                    hashMap.put("Упражнения", hashMap.get("Упражнения") + result);
                } else if (matcher.group(5).trim().contains("Решения")) {
                    hashMap.put("Решения", hashMap.get("Решения") + result);
                } else if (matcher.group(5).trim().contains("Перерыв")) {
                    hashMap.put("Перерывы", hashMap.get("Перерывы") + result);
                } else {
                    hashMap.put("Лекции", hashMap.get("Лекции") + result);
                }

                result = 0;
            }

            int sum = hashMap.get("Упражнения") + hashMap.get("Решения") + hashMap.get("Перерывы") + hashMap.get("Лекции");

            resultString = resultString + "Лекции: " + hashMap.get("Лекции") + " " + (int) (((float)hashMap.get("Лекции") / sum) * 100) + "%\r\n"
                    + "Упражнения: " + hashMap.get("Упражнения") + " " + (int) (((float)hashMap.get("Упражнения") / sum) * 100) + "%\r\n" +
                    "Перерывы: " + hashMap.get("Перерывы") + " " + (int) (((float)hashMap.get("Перерывы") / sum) * 100) + "%\r\n" +
                    "Решения: " + hashMap.get("Решения") + " " + (int) (((float) hashMap.get("Решения") / sum) * 100) + "%\r\n" + "\r\n";

        }
        return resultString;
    }
}
