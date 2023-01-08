package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

public class AuthorisationHandler implements RequestHandler {
    @Override
    public void handle() {

        System.out.println("authorisation handling. ");

    }
}
