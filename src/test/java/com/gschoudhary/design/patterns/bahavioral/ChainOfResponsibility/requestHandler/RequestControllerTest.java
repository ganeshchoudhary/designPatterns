package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.requestHandler;

import org.junit.jupiter.api.Test;

import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler.AuthenticationHandler;
import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler.CustomHandler;
import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler.RequestController;
import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler.RequestHandler;
import com.bytecoder.design.patterns.bahavioral.ChainOfResponsibility.requestHandler.RequestHandlerImpl;

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