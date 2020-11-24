package com.sparkybit.test.fibonacci;

import java.util.List;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;

public class Formatter {

    public String format(List<String> lines) {
        List<String> linesWithNumbersAsInFibonacciSequence = FibonacciUtils.getLinesWithNumbersAsInSequence(lines);
        return linesWithNumbersAsInFibonacciSequence
                .stream()
                .parallel()
                .map(this::reverseString)
                .collect(joining(lineSeparator()));
    }

    private String reverseString(String line) {
        char[] chars = line.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int index = chars.length - 1; index >= 0; index--) {
            result.append(chars[index]);
        }
        return result.toString();
    }
}
