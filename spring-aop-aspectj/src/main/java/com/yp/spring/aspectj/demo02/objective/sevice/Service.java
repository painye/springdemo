package com.yp.spring.aspectj.demo02.objective.sevice;

import com.yp.spring.aspectj.demo02.objective.Student;

public interface Service {
    public void doSome(String name, Integer age);
    public String doOther(String name);
    public Student doOther(String name, Integer age);
}
