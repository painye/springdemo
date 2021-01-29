package com.yp.spring.aspectj.demo03.objective.imp;

import com.yp.spring.aspectj.demo03.objective.Student;
import com.yp.spring.aspectj.demo03.objective.sevice.Service;
import org.springframework.stereotype.Component;

@Component
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

    @Override
    public Integer doFirst(String name, Integer age) {
        System.out.println("当前正在执行获取年龄业务：-------"+age);
        return age;
    }
}
