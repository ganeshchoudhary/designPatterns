package com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public interface RequestHandler {

    void handle(Request request);
}
