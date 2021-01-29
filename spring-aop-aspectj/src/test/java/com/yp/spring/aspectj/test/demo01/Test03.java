package com.yp.spring.aspectj.test.demo01;

import com.yp.spring.aspectj.demo03.objective.sevice.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test03 {

    @Test
    public void test01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:demo03/applicationContext.xml");
        Service myServiceImpProxy = factory.getBean("serviceImp", Service.class);
        Integer age=myServiceImpProxy.doFirst("张三",30);
        System.out.println("主函数-----------"+age);
        Service myServiceImp02Proxy = factory.getBean("serviceImp2", Service.class);
        age =myServiceImp02Proxy.doFirst("李四", 40);
        System.out.println("主函数-----------"+age);
    }
}
