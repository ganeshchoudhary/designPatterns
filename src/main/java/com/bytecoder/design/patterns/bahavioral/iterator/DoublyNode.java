package com.bytecoder.design.patterns.bahavioral.iterator;

import lombok.Data;

@Data
public class DoublyNode {

    int data;
    DoublyNode next, previous;
   public DoublyNode(int data){
        this.data=data;
    }
}
