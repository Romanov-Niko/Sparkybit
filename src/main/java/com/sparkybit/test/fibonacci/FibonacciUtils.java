package com.sparkybit.test.fibonacci;

import java.util.ArrayList;
import java.util.List;

public final class FibonacciUtils {

    private FibonacciUtils() {
    }

    public static List<Integer> getSequenceToUpperBound(int upperBound) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        if (upperBound == 0) {
            return fibonacciNumbers;
        }
        fibonacciNumbers.add(1);
        for (int index = 2; index < index + 1; index++) {
            int fibonacciNumber = fibonacciNumbers.get(index - 1) + fibonacciNumbers.get(index - 2);
            if (fibonacciNumber <= upperBound) {
                fibonacciNumbers.add(fibonacciNumber);
            } else {
                break;
            }
        }
        return fibonacciNumbers;
    }

    public static List<String> getLinesWithNumbersAsInSequence(List<String> lines) {
        List<Integer> fibonacciNumbers = getSequenceToUpperBound(lines.size());
        List<String> linesWithNumbersAsInFibonacciSequence = new ArrayList<>();
        for (int index = 2; index < fibonacciNumbers.size(); index++) {
            int fibonacciNumber = fibonacciNumbers.get(index);
            linesWithNumbersAsInFibonacciSequence.add(lines.get(fibonacciNumber - 1));
        }
        return linesWithNumbersAsInFibonacciSequence;
    }
}
