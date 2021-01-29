package com.yp.spring.aspectj.demo01.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * Aspect：注解申明该类是一个切面类
 */
@Aspect
public class MyAspect {

    /**
     * @Before：是注解表明了功能代码在连接点的切入时间，这里是before所以是在业务代码之前进行切入
     *      切入表达式表明了目标对象和业务代码也就是切入的位置
     *      功能代码的内容就是切面的内容
     */
    @Before(value = "execution(public void com.yp.spring.aspectj.demo01.objective.imp.ServiceImp*.doSome(..))")
    public void myDo(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println(jp.getSignature().getName());
        Object[] args = jp.getArgs();
        for (Object arg : args) {
            System.out.println(arg.getClass().getName()+arg);
        }
        System.out.println("当前时间是："+ new Date());
    }
}
