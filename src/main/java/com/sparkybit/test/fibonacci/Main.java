package com.sparkybit.test.fibonacci;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.read("source.txt");
        Formatter formatter = new Formatter();
        String result = formatter.format(lines);
        try (Writer writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("output.txt"), StandardCharsets.UTF_8))) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
