package com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler;

public class RequestHandlerImpl implements RequestHandler {
    @Override
    public void handle() {
        System.out.println("basic handler");
    }
}
