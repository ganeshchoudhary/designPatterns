package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.chainflow;

import org.junit.jupiter.api.Test;

class RequestControllerTest {
    RequestHandlerImpl requestHandler = new RequestHandlerImpl();

    RequestController requestController = new RequestController();

    @Test
    void execute() {
        requestHandler
                .addHandler(new AuthenticationHandler())
                .addHandler(new CustomHandler()).handle();
        requestController.execute();

    }
}