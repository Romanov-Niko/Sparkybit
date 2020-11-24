package com.sparkybit.test.fibonacci;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class FileReader {

    public List<String> read(String fileName) throws FileNotFoundException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            throw new FileNotFoundException("Missing file \"" + fileName + "\"");
        }
        return new BufferedReader(new InputStreamReader(inputStream))
                .lines()
                .parallel()
                .collect(toList());
    }
}
