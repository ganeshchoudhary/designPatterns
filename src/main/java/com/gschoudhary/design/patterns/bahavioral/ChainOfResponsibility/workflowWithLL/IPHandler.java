package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow;

public class IPHandler extends BasicHandler {

    IPHandler(){

    }
    @Override
    public void handle(Request request) {
        System.out.println("IP handler " + a);
        if(request.ip == null){
            return;
        }else {
            super.handle(request);
        }
    }
}
