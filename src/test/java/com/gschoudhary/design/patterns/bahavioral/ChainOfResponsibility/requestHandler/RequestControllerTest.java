package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.requestHandler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestControllerTest {

    RequestController requestController= new RequestController();
    RequestHandler requestHandler = new RequestHandlerImpl();

    @Test
    void execute() {

        new AuthenticationHandler(new CustomHandler(requestHandler)).handle();
        requestController.execute();
    }
}