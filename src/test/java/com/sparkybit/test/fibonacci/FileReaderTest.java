package com.sparkybit.test.fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FileReaderTest {

    private FileReader fileReader;

    @BeforeEach
    public void setUp() {
        fileReader = new FileReader();
    }

    @Test
    void givenSourceTxtFile_whenRead_thenReturnedListOfLines() throws FileNotFoundException {
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");

        List<String> actual = fileReader.read("source.txt");

        assertEquals(expected, actual);
    }

    @Test
    void givenNonExistentFile_whenRead_thenFileNotFoundExceptionWithFileName() {
        String expected = "Missing file \"NONEXISTENT\"";

        FileNotFoundException exception = assertThrows(FileNotFoundException.class, () -> fileReader.read("NONEXISTENT"));

        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }
}