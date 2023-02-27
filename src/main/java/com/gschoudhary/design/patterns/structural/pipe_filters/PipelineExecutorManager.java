package com.gschoudhary.design.patterns.structural.pipe_filters;

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

}


