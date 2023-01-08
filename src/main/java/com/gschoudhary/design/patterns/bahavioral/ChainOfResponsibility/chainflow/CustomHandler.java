package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

public class CustomHandler implements RequestHandler {
    @Override
    public void handle() {
        System.out.println("Custom handle");
    }
}
