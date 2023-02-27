package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility;

import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow.Request;
import com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility.workflow.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        Request request = new Request();
        UserService userService = new UserService();
        userService.execute(request);
    }
}