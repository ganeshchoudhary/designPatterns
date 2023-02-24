package com.gschoudhary.design.patterns.structural.pipe_filters;

public interface Filter <I,O>{

    O execute(I input);

}
