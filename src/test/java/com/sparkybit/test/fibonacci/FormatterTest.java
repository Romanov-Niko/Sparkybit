package com.sparkybit.test.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterTest {

    private Formatter formatter;

    @BeforeEach
    public void setUp() {
        formatter = new Formatter();
    }

    @Test
    void givenSevenLines_whenFormat_thenReturnedReversedFirstSecondThirdAndFifthLine() {
        String expected = "4321" + lineSeparator() +
                "5432" + lineSeparator() +
                "6543" + lineSeparator() +
                "8765";

        List<String> testData = new ArrayList<>();
        testData.add("1234");
        testData.add("2345");
        testData.add("3456");
        testData.add("aaaa");
        testData.add("5678");
        testData.add("aaaa");
        testData.add("aaaa");
        String actual = formatter.format(testData);

        assertEquals(expected, actual);
    }

    @Test
    void givenLine_whenFormat_thenReturnedReversedLine() {
        String expected = "4321";

        List<String> testData = new ArrayList<>();
        testData.add("1234");
        String actual = formatter.format(testData);

        assertEquals(expected, actual);
    }

    @Test
    void givenNoLines_whenFormat_thenReturnedEmptyString() {
        String expected = "";

        String actual = formatter.format(new ArrayList<>());

        assertEquals(expected, actual);
    }
}