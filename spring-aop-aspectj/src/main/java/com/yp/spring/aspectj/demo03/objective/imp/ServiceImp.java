package com.yp.spring.aspectj.demo03.objective.imp;

import com.yp.spring.aspectj.demo03.objective.Student;
import com.yp.spring.aspectj.demo03.objective.sevice.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceImp implements Service {
    @Value("min")
    private String name;
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("当前正在执行购买业务：-------");
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
          System.out.println("当前正在执行获取年龄业务：-------"+age+this.name);
        return age;
    }

    @Override
    public String toString() {
        return "ServiceImp{" +
                "name='" + name + '\'' +
                '}';
    }
}
