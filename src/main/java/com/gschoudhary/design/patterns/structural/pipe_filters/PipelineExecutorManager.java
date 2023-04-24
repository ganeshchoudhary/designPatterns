package com.gschoudhary.design.patterns.structural.pipe_filters;

import com.gschoudhary.design.patterns.structural.pipe_filters.example1.DtoFilter;
import com.gschoudhary.design.patterns.structural.pipe_filters.example1.EntityFilter;
import com.gschoudhary.design.patterns.structural.pipe_filters.example1.FileReaderFilter;
import com.gschoudhary.design.patterns.structural.pipe_filters.example1.UserEntity;

import java.util.List;

public class PipelineExecutorManager {
    public Integer process(String input) {
        Pipeline<String, Integer> pipeline = new Pipeline<>(new StringFilter())
                .pipe(new FloatFilter())
                .pipe(new IntFilter());

        return pipeline.process(input);
    }


    public Integer process2(String input) {
        Pipeline<String, Integer> pipeline = new Pipeline<>(new StringFilter())
                .pipe(new FloatFilter())
                .pipe(new IntFilter())
                .pipe((Integer integer)-> 2*integer);

        return pipeline.process(input);
    }

    public List<UserEntity> process3(String input){
        Pipeline<String, List<UserEntity>> pipeline = new Pipeline<>(new FileReaderFilter()).pipe(new DtoFilter()).pipe(new EntityFilter());
        return pipeline.process(input);
    }

}


