package com.bytecoder.DSA.Trees;

import java.util.List;

public interface Tree<T extends Comparable<T>> {

    Node<T> getRoot();

    Tree<T> insert(T data);

    void traverse(TraversalType traversalType);

    int getMax();

    int getMin();

    int getHeight();

    int getLevel(T data);

    List<Node<T>> getNodesAtLevel(int level);

    boolean searchData(T data);

    boolean isEmpty();

    void delete(T data);

}
