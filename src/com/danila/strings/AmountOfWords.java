package com.danila.strings;

public class AmountOfWords {
    public static void main(String[] args) {
        String testString = "   asd jggo    7tuhli8yh jnjkhjkh   kjhbkj         gkhjkhj     ";

        boolean flag = false;
        int result = 0;

        String resultString = testString.trim();

        for (int i = 0; i < resultString.length(); i++) {
            if (flag) {
                if (resultString.charAt(i) != ' '){
                    flag = false;
                }
            } else  {
                if (i == 0){
                    result++;
                }
                if (resultString.charAt(i) == ' ') {
                    result++;
                    flag = true;
                }
            }
        }

        System.out.println(result);
    }
}
