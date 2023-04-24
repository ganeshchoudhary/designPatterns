package com.gschoudhary.design.patterns.structural.pipe_filters.example1;

import com.gschoudhary.design.patterns.structural.pipe_filters.Filter;

import java.util.ArrayList;
import java.util.List;

public class EntityFilter implements Filter<List<UserDto>, List<UserEntity>> {
    @Override
    public List<UserEntity> execute(List<UserDto> userDtos) {
        List<UserEntity> userEntities = new ArrayList<>();
        for (UserDto input :
                userDtos) {

            userEntities.add(new UserEntity(input.getName(), input.getAge()));
        }
        return userEntities;
    }
}
