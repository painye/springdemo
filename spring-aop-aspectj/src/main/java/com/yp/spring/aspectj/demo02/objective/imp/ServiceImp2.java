package com.yp.spring.aspectj.demo02.objective.imp;

import com.yp.spring.aspectj.demo02.objective.Student;
import com.yp.spring.aspectj.demo02.objective.sevice.Service;

public class ServiceImp2 implements Service {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("当前正在执行提交业务：-------");
    }

    @Override
    public String doOther(String name) {
        System.out.println("当前正在执行改名业务：-------"+name);
        return name;
    }

    @Override
    public Student doOther(String name, Integer age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        System.out.println("当前正在执行录入业务：-------"+student);
        return student;
    }
}
