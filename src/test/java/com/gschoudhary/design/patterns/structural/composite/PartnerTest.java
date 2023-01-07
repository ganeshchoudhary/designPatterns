package com.gschoudhary.design.patterns.structural.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//problem
// create hierarchy
// get hierarchy of that level or user
//
class PartnerTest {
    Partner sonata = new Partner("sonata");

    @BeforeEach
    void setUp() {
    }

    @Test
    public void createPartnerHierarchy() {
        sonata.addRole("National-Head");
        sonata.addRole("State-Head");
        sonata.addRole("Regional-Head");
        sonata.addRole("Branch manager");
        sonata.addRole("Center");
        sonata.addHierarchy(new PartnerHierarchy("India", sonata.getIndexOf("National-Head"), "National-Head")
                .addOrReplaceUser("sayar")
                .addChildHierarchy(
                        new PartnerHierarchy("Rajasthan", sonata.getIndexOf("State-Head"), "State-Head")
                                .addOrReplaceUser("ganesh")
                                .addChildHierarchy(
                                        new PartnerHierarchy("Jaipur", sonata.getIndexOf("Regional-Head"), "Regional-Head").addOrReplaceUser("ram").addChildHierarchy(new LeafHierarchy("Champapura", sonata.getIndexOf("Center"), "Center").addCustomer("Ramu"))))
                .addChildHierarchy(new PartnerHierarchy("karnataka", sonata.getIndexOf("State-Head"), "State-Head")));
        sonata.addHierarchy(new PartnerHierarchy("Srilanka", sonata.getIndexOf("Notional-Head"), "National-Heade")
                .addChildHierarchy(new PartnerHierarchy("s-1", sonata.getIndexOf("State-Head"), "State-Head"))
                .addChildHierarchy(new PartnerHierarchy("s2", sonata.getIndexOf("State-Head"), "State-Head"))
        );
        sonata.print();
    }

    @Test
    public void printUserHierarchy(){
        sonata.printUserHierarchy("sayar",1);
    }
}