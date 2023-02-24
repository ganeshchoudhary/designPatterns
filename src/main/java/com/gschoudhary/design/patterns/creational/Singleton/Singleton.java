package com.gschoudhary.design.patterns.creational.Singleton;

public class Singleton {
    public static void main(String[] args) {
        User user = User.getUser();
        System.out.println(user.hashCode());
        user.setName("ganesh");
        System.out.println(User.getUser().hashCode());
        System.out.println(User.getUser().hashCode());
    }
}
