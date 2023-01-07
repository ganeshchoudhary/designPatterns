package com.gschoudhary.design.patterns.bahavioral.ChainOfResponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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