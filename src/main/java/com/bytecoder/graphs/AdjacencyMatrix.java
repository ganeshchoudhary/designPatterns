package com.bytecoder.graphs;

import java.util.ArrayList;
import java.util.List;

class Node {
    String name;

    public Node(String name) {
        this.name = name;
    }

}
class Vertex {
    int id;

    Node node;

    boolean visited;

    Vertex(int index, Node node){
        this.id = index;
        this.node = node;
        this.visited = false;
    }
}
class Edge {
    Vertex start;

    Vertex end;

    int cost;

    boolean directed;

    Edge(Vertex start, Vertex end, int cost) {
        this.start = start;
        this.end = end;
        this.cost = cost;
        this.directed = false;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class AdjacencyMatrix {

    public static void addEdge(int[][] matrix, Edge edge){
        int i  =  edge.start.id;
        int j  =  edge.end.id;
        matrix[i][j] = edge.cost;
        if(!edge.directed){
            matrix[j][i] = edge.cost;

        }
    }
    public static void main(String[] args) {
        List<Vertex> vertices = new ArrayList<>();
        int [][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j]= -1;
            }
        }
        String[] values = {"A", "B", "C", "D"};
        for (int i = 0; i < 4; i++) {
            vertices.add(new Vertex(i,new Node(values[i])));
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        addEdge(matrix, new Edge(vertices.get(0), vertices.get(1), 10));
        addEdge(matrix, new Edge(vertices.get(0), vertices.get(2), 20));
        addEdge(matrix, new Edge(vertices.get(0), vertices.get(3), 10));
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
