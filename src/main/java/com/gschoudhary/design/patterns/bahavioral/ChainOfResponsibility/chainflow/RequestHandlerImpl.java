package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import java.util.LinkedList;

public class RequestHandlerImpl implements RequestHandler {
    private LinkedList<RequestHandler> handlers = new LinkedList<>();

    public RequestHandlerImpl addHandler(RequestHandler requestHandler) {
        handlers.add(requestHandler);
        return this;
    }

    @Override
    public void handle() {
        System.out.println("basic handler");
        try {
            for (RequestHandler handler : handlers
            ) {
                handler.handle();
            }
        }catch (Exception e){
            System.out.println("exception occurred");
        }
    }
}
