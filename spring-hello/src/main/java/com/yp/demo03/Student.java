package com.yp.demo03;

import com.yp.demo02.School;

public class Student {
    private String name;
    private int number;
    private int grade;
    private House school;

    public Student() {
    }

    public Student(String name, int number, int grade) {
        this.name = name;
        this.number = number;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", grade=" + grade +
                ", school=" + school +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSchool(House school) {
        this.school = school;
    }
}
