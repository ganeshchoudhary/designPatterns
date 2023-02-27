package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public class AuthenticationHandler implements RequestHandler {

    @Override
    public void handle(Request request) {

        System.out.println("Authentication handler  ");
        throw new RuntimeException("not working");
    }
}
