package com.gschoudhary.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Partner {
    private String name;

    List<Hierarchy> hierarchies;

    List<String> roles;

    Partner(String name) {
        this.name = name;
        this.hierarchies = new ArrayList<>();
        this.roles = new ArrayList<>();
    }

    public void addHierarchy(Hierarchy state) {
        hierarchies.add(state);
    }

    public void removeHierarchy() {
        System.out.println("not defined");
    }

    public void addRole(String role){
        roles.add(role);
    }

    public int getIndexOf(String role){
        return roles.indexOf(role);
    }
    public void print() {
        for (Hierarchy p : hierarchies) {
            p.printHierarchyDetails();
        }
    }

    public void printUserHierarchy(String name, int level) {

    }
}
