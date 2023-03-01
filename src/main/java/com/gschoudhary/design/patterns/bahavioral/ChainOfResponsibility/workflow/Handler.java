package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow;

public interface Handler {
     Handler addNext(Handler handler);

    void handle(Request request);
}
