package com.yp.test;

import com.yp.sevice.impl.KFC;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestFactory {
    @Test
    public void testFactory(){
        //1、读取文件application
        //可以理解为工厂的接口, 创建Spring工厂
        ApplicationContext factory =
                new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println(factory);
        //无论用工厂创建几个同一类型的对象，他都是同一个对象，引用相同，采取单例模式
        KFC myKFC = factory.getBean("myKFC", KFC.class);
        myKFC.support();
    }
}
