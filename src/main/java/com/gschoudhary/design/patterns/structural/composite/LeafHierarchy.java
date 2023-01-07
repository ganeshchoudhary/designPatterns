package com.gschoudhary.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class LeafHierarchy implements Hierarchy {
    private String name;

    private String role;

    private String user;

    private int level;

    private List<String> customers;

    LeafHierarchy(String name, int level, String role) {
        this.name = name;
        this.level = level;
        this.role = role;
        this.customers = new ArrayList<>();
    }

    public LeafHierarchy addCustomer(String child) {
        customers.add(child);
        return this;
    }

    public LeafHierarchy addOrReplaceUser(String user) {
        this.user = user;
        return this;
    }

    @Override
    public void printHierarchyDetails() {
        System.out.println("level " + level + "--name " + name + " user " + user + "  role " + role);
        System.out.println("under " + name);
        if (customers.size() == 0) {
            System.out.println("end");
        }
        for (String h : customers) {
            System.out.println("******  " + h);
        }
    }
}
