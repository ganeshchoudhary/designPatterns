package com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public class CustomHandler implements RequestHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Custom handle");
    }
}
