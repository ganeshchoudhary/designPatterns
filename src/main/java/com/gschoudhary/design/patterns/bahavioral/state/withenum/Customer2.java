package com.gschoudhary.design.patterns.bahavioral.state.withenum;

import lombok.Data;

@Data
public class Customer2 {

    private String name;
    private int age;
    private CustomerStates2 customerState = CustomerStates2.INITIAL;
}
