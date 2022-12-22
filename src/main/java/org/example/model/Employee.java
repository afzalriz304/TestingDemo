package org.example.model;

public class Employee {

    private String name;
    private String post;

    public Employee(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof Employee)) return false;
        Employee o = (Employee) obj;
        return o.getName() == this.getName();
    }
}
