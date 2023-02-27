package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow;

public class BasicHandler  {
    BasicHandler next;
    int a=10;

    

    BasicHandler() {

    }

    public void add(BasicHandler handler) {
        if (next == null) {
            next = handler;
        } else {
            next.add(handler);
        }


    }


    public void handle(Request request) {
        if(next == null){
            return;
        }else {
            next.handle(request);
            next= next.next;
        }

    }

}
