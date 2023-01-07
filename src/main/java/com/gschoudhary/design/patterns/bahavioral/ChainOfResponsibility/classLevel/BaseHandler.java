package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.classLevel;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.BasicHandler;
import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.Request;

public class BaseHandler {

    BaseHandler next;

    public BaseHandler(BaseHandler next){
        this.next = next;
    }

    public void handle(Request request){
        System.out.println("base");
        if(next != null){
            next.handle(request);
        }
    }
}
