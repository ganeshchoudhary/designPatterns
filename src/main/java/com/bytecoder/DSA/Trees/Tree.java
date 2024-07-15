package com.bytecoder.DSA.Trees;

public interface Tree<T extends Comparable<T>> {

    Tree<T> insert(T data);

    void delete(T data);

    void traverse(TraversalType traversalType);

    T getMax();

    T getMin();

    boolean isEmpty();
}
