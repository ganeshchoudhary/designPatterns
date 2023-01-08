package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

public class AuthenticationHandler implements RequestHandler {

    @Override
    public void handle() {

        System.out.println("Authentication handler  ");
        throw new RuntimeException("not working");
    }
}
