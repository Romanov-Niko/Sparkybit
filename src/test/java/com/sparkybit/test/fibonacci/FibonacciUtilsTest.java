package com.sparkybit.test.fibonacci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciUtilsTest {

    @Test
    void givenUpperBoundFive_whenGetSequenceToUpperBound_thenReturnedFirstSixElements() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        List<Integer> actual = FibonacciUtils.getSequenceToUpperBound(5);

        assertEquals(expected, actual);
    }

    @Test
    void givenUpperBoundSix_whenGetSequenceToUpperBound_thenReturnedAllElementsBeforeSix() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        List<Integer> actual = FibonacciUtils.getSequenceToUpperBound(6);

        assertEquals(expected, actual);
    }

    @Test
    void givenUpperBoundZero_whenGetSequenceToUpperBound_thenReturnedZero() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        List<Integer> actual = FibonacciUtils.getSequenceToUpperBound(0);

        assertEquals(expected, actual);
    }

    @Test
    void givenUpperBoundOne_whenGetSequenceToUpperBound_thenReturnedFirstThreeElements() {
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(1);

        List<Integer> actual = FibonacciUtils.getSequenceToUpperBound(1);

        assertEquals(expected, actual);
    }
}