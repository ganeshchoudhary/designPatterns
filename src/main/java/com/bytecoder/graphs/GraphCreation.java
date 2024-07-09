package com.bytecoder.graphs;

import java.util.LinkedList;

// This class represents a directed graph using adjacency
// list representation
class Graph {
    // No. of vertices
    private int V;

    // Adjacency Lists
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);

    }
    void printAllRelationsOfV(int v){
        adj[v].forEach(System.out::println);
    }
}
public class GraphCreation {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        LinkedList<Integer> [] list = new LinkedList[10];
        LinkedList<Integer> l1 = new LinkedList<>();
        g.printAllRelationsOfV(0);



    }
}

