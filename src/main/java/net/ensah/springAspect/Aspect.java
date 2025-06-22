package net.ensah.springAspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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

    @Pointcut("execution(* net.ensah.service.IUserServiceImp2.*(..))")
    public void p2() {}


//    @Before("p1()")
//    public void f1(){
//        System.out.println("*********************");
//        System.out.println("hi from proxy jdk");
//    }
//
//
//    @Before("p2()")
//    public void f2(){
//        System.out.println("*********************");
//        System.out.println("hi from aspectj");
//    }

    @Around("@annotation(net.ensah.Aspect.Time)")
    public Object f3(ProceedingJoinPoint joinPoint) throws Throwable {
        var t1=System.currentTimeMillis();
        Object result = joinPoint.proceed();
        var t2=System.currentTimeMillis();
        System.out.println("time d'execution "+(t2-t1));
        return result;
    }



}
