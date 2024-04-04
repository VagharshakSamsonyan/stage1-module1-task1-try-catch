package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, also join strings with space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS = Arrays.asList(
            "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                    .split(" "));

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder justWordsBuilder = new StringBuilder();

        for (String word : WORDS) {
            try {
                int number = Integer.parseInt(word);
                sum += number;
            } catch (NumberFormatException ignored) {
                justWordsBuilder.append(word).append(" ");
            }
        }

        String justWords = justWordsBuilder.toString().trim();

        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords);
    }
}
