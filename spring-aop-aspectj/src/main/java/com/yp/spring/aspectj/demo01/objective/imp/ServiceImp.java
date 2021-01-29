package com.yp.spring.aspectj.demo01.objective.imp;

import com.yp.spring.aspectj.demo01.objective.sevice.Service;

public class ServiceImp implements Service {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("当前正在执行购买业务：-------");
    }
}
