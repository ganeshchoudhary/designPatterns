package com.gschoudhary.design.patterns.structural.pipe_filters.example1;

import com.gschoudhary.design.patterns.structural.pipe_filters.Filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderFilter implements Filter< String, List<String>> {


    @Override
    public List<String> execute(String input)  {
        Path path = Paths.get(input);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
