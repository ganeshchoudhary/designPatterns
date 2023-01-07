package com.gschoudhary.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class PartnerHierarchy implements Hierarchy {
    private String name;

    private String role;

    private String user;

    private int level;

    private List<Hierarchy> childHierarchy;

    PartnerHierarchy(String name, int level, String role) {
        this.name = name;
        this.level = level;
        this.role = role;
        this.childHierarchy = new ArrayList<>();
    }

    public PartnerHierarchy addChildHierarchy(Hierarchy child) {
        childHierarchy.add(child);
        return this;
    }

    public PartnerHierarchy addOrReplaceUser(String user) {
        this.user = user;
        return this;
    }

    @Override
    public void printHierarchyDetails() {
        System.out.println("level " + level + "--name " + name + " user " + user + "  role " + role);
        System.out.println("under " + name);
        if (childHierarchy.size() == 0) {
            System.out.println("end");
        }
        for (Hierarchy h : childHierarchy) {
            h.printHierarchyDetails();
        }
    }
}
