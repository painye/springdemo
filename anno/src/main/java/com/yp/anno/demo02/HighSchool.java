package com.yp.anno.demo02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class HighSchool extends School{
    @Value("高级第一中学")
    private String name;
    @Value("汉台区")
    private String address;
    @Value("3")
    private int grade;


    @Override
    public String toString() {
        return "HighSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                '}';
    }
}
