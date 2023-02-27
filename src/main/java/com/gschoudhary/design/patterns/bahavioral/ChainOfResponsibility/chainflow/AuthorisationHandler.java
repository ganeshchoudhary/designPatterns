package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public class AuthorisationHandler implements RequestHandler {
    @Override
    public void handle(Request request) {

        System.out.println("authorisation handling. ");

    }
}
