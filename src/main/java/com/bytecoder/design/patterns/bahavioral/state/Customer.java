package com.bytecoder.design.patterns.bahavioral.state;

import lombok.Data;

@Data
public class Customer {

    private String name;
    private int age;
    private CustomerState customerState = CustomerState.INITIAL;
}
