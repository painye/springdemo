package com.yp.spring.aspectj.demo03.aspect;

import com.yp.spring.aspectj.demo02.objective.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Aspect：注解申明该类是一个切面类
 */
@Component()
@Aspect
public class MyAspect {

    /**
     * 环绕通知
     *      1、有返回类型与前两个最大的不同，且改返回值是最终目标对象的返回值
     *      2、环绕通知可以控制目标函数的执行
     *      3、环绕通知可以
     * @param pjp  该参数其实是一个JointPoin的继承类
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(Integer com.yp.spring.aspectj.demo03.objective.imp.ServiceImp*.doFirst(String, Integer))")
    public Object myDoFirst(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前------"+pjp.getSignature().getName());
        Integer age = null;
        Object[] args = pjp.getArgs();
        Object proceed = pjp.proceed();
        age = (Integer) proceed;
        if(args[0].equals("张三")){

            age = 0;
        }
        System.out.println("环绕后-------");
        return age;
    }

}
