package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility;

public class TokenHandler extends BasicHandler {
    TokenHandler() {

    }

    @Override
    public void handle(Request request) {
        System.out.println("Token handler");
        if(request.ip == null){
            return;
        }else {
            super.handle(request);
        }
    }
}
