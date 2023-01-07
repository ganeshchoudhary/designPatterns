package com.gschoudhary.design.patterns.creational;

class User {
    private String name;

    private String role;

    private static User user;

    private User() {
    }

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
public class Singleton {
    public static void main(String[] args) {
        User user = User.getUser();
        System.out.println(user);
        user.setName("ganesh");
        System.out.println(User.getUser());
    }
}
