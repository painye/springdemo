package com.yp.spring.aspectj.test.demo01;

import com.yp.spring.aspectj.demo01.objective.imp.ServiceImp;
import com.yp.spring.aspectj.demo01.objective.sevice.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test01 {

    @Test
    public void test01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:demo01/applicationContext.xml");
        Service myServiceImpProxy = factory.getBean("myServiceImp", Service.class);
        myServiceImpProxy.doSome("张三",30);
        Service myServiceImp02Proxy = factory.getBean("myServiceImp02", Service.class);
        myServiceImp02Proxy.doSome("李四", 40);
    }
}
