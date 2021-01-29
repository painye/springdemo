package com.yp.anno.demo03;


public class HighSchool extends School {
    private String name;
    private String address;
    private int grade;


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "HighSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                '}';
    }
}
