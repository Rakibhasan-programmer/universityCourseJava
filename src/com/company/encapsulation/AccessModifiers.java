package com.company.encapsulation;

public class AccessModifiers {
    public String name; // any class can access this
    private String password; // only access by this class
    protected String profession; // any class in this package and subclass in other package
    int age; // any class can access this in this package.

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
