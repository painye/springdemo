package com.yp.entity;

public class School {
    private String name;
    private String address;
    private int grade;

    public School() {
    }

    public School(String name, String address, int grade) {
        this.name = name;
        this.address = address;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
