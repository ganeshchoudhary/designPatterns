package com.bytecoder.DSA.Trees;

import org.yaml.snakeyaml.nodes.NodeId;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    public BinarySearchTree() {

    }

    public Node getRoot() {
        return root;
    }

    public Node<T> insertNode_v2(T data, Node<T> node) {

        if(node == null){
            return  new Node<>(data);
        }
        if(node.getData().compareTo(data)>0){
            node.setLeftChild(insertNode_v2(data, node.getLeftChild())) ;
        }else {
            node.setRightChild(insertNode_v2(data, node.getRightChild()));
        }
        return node;
    }


    public void insertNode(T data, Node<T> node) {
        if(node.getData().compareTo(data)>0){
            if(node.getLeftChild() != null){
                insertNode(data, node.getLeftChild());

            }else {
                node.setLeftChild(new Node<>(data)) ;

            }
        }else {
            if(node.getRightChild() != null) {
                insertNode(data, node.getRightChild());
            }else {
                node.setRightChild(new Node<>(data));
            }
        }
    }

    @Override
    public Tree<T> insert(T data) {
        if (this.isEmpty()) {
            root = new Node(data);
        } else {
            insertNode(data, root);
        }
        return this;
    }

    @Override
    public void delete(T data) {



    }



    @Override
    public void traverse(TraversalType traversalType) {
        if ((traversalType.equals(TraversalType.IN_ORDER))){
            traverseInOrder(this.root);
        }
        if(traversalType.equals(TraversalType.POST_ORDER)){
            traversePostOrder(this.root);

        }
        if(traversalType.equals(TraversalType.PRE_ORDER)){
            traversePreOrder(this.root);

        }
        if(traversalType.equals(TraversalType.LEVEL_ORDER)){
            traverseLevelOrder(this.root);

        }
    }


    @Override
    public T getMax() {
        if (isEmpty()) {
            return null;
        }
        Node<T> curr = root;
        while (curr.getRightChild() != null) {
            curr = curr.getRightChild();
        }

        return curr.getData();
    }



    @Override
    public T getMin() {
        if (isEmpty()) {
            return null;
        }
        Node<T> curr = root;
        while (curr.getLeftChild() != null) {
            curr = curr.getLeftChild();
        }
        return curr.getData();
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }


    private T getMax(Node<T> node) {
        if (node.getRightChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }


    private void traversePreOrder(Node<T> node) {

        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        traverseInOrder(node.getLeftChild());
        traverseInOrder(node.getRightChild());
    }

    private void traversePostOrder(Node<T> node) {

        if (node == null) {
            return;
        }
        traverseInOrder(node.getLeftChild());
        traverseInOrder(node.getRightChild());
        System.out.println(node.getData());

    }


       private void traverseInOrder(Node<T> node) {

        if (node == null) {
            return;
        }
        traverseInOrder(node.getLeftChild());
        System.out.println(node.getData());
        traverseInOrder(node.getRightChild());
    }

    private void traverseLevelOrder(Node<T> node) {

        if (node == null) {
            return;
        }
        Node<T> curr = node;
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(curr);
        while (!queue.isEmpty()){
            Node<T> temp = queue.poll();
            System.out.println(temp.getData());

            if(temp.getLeftChild() != null){
                queue.add(temp.getLeftChild());
            }

            if(temp.getRightChild() != null){
                queue.add(temp.getRightChild());
            }

        }
    }

}
