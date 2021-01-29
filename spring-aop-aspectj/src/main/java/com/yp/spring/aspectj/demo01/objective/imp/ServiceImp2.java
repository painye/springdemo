package com.yp.spring.aspectj.demo01.objective.imp;

import com.yp.spring.aspectj.demo01.objective.sevice.Service;

public class ServiceImp2 implements Service {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("当前正在执行提交业务：-------");
    }
}
