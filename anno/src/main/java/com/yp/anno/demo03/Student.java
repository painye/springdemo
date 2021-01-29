package com.yp.anno.demo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @component朱姐的功能是为该类创建一个名字为value的对象
 */
public class Student {
    private String name;
    private int age;

    private House school;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(House school) {
        this.school = school;
    }
}
