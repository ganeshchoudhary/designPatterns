package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;

public interface RequestHandler {

    void handle(Request request);
}
