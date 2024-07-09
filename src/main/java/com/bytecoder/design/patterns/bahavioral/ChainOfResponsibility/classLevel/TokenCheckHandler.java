package com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.classLevel;

import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public class TokenCheckHandler extends BaseHandler {
    public TokenCheckHandler(BaseHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        System.out.println("base2");
        if (next != null & request.token != null) {
            next.handle(request);
        }
    }
}
