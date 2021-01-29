package com.yp.spring.aspectj.demo02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.sql.PreparedStatement;
import java.util.Date;
import com.yp.spring.aspectj.demo02.objective.Student;

/**
 * Aspect：注解申明该类是一个切面类
 */
@Aspect
public class MyAspect {

   @AfterReturning(value = "execution(public * com.yp.spring.aspectj.demo02.objective.imp.Service*.doOther(String, Integer))", returning = "res")
    public void myDoOther1(JoinPoint jp,Object res){
      System.out.println(jp.getSignature().getName());
      Student stu = (Student) res;
      stu.setName("李四");
      stu.setAge(20);
      System.out.println("after功能块---------"+res);
   }

}
