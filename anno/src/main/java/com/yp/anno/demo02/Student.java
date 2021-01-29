package com.yp.anno.demo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @component朱姐的功能是为该类创建一个名字为value的对象
 */
@Component(value = "myStudent")
public class Student {
    @Value("小虎")
    private String name;
    @Value("23")
    private int age;

    @Autowired()
    private House school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
