package com.gschoudhary.design.patterns.structural.pipe_filters;

 interface Filter<I, O> {
    O execute(I input);



}
