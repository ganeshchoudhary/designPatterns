package com.gschoudhary.design.patterns.structural.pipe_filters.example1;

import com.gschoudhary.design.patterns.structural.pipe_filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class DtoFilter implements Filter<List<String>, List<UserDto>> {
    @Override
    public List<UserDto> execute(List<String> lines) {
       List<UserDto> userDtos = new ArrayList<>();
        for (String input: lines) {
            String[] str =  input.split(",");
            userDtos.add(new UserDto(str[0].trim(), Integer.parseInt(str[1].trim())));
        }
        return userDtos;
    }
}
