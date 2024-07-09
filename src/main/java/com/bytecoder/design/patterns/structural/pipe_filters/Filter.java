package com.bytecoder.design.patterns.structural.pipe_filters;

import java.io.IOException;

public interface Filter<I, O> {
    O execute(I input) ;



}
