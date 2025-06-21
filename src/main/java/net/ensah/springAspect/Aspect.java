package net.ensah.springAspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
@EnableAspectJAutoProxy
public class Aspect {

    @Pointcut("execution(* net.ensah.service.IUserServiceImpl.*(..))")
    public void p1() {}

    @Before("p1()")
    public void f1(){
        System.out.println("*********************");
        System.out.println("hi from proxy jdk");
    }

}
