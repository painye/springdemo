package com.yp.spring.aspectj.test.demo02;

import com.yp.spring.aspectj.demo02.objective.Student;
import com.yp.spring.aspectj.demo02.objective.sevice.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test02 {

    @Test
    public void test01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:demo02/applicationContext.xml");
        Service myServiceImpProxy = factory.getBean("myServiceImp", Service.class);
        String s = myServiceImpProxy.doOther("张三");
        System.out.println("主函数中--------"+s);

        Student stu = myServiceImpProxy.doOther("王五", 20);
        System.out.println("主函数中--------"+stu);
    }
}
