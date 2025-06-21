package net.ensah.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class FirstAspect {

      @Pointcut("execution(void net.ensah.Main.main(..))")
       public void p1(){}

       @Pointcut("execution(int net.ensah.utils.Calculate.calculate(..))")
       public void p2(){}

//      @Before("p1()")
//      public void FirstMessage(){
//          System.out.println("***************");
//          System.out.println("First Message Before Main");
//          System.out.println("***************");
//      }
//
//        @After("p1()")
//        public void LastMessage(){
//            System.out.println("***************");
//            System.out.println("Last Message After Main");
//            System.out.println("***************");
//        }

        @Around("p2()")
       public Object f2(ProceedingJoinPoint pjp) throws Throwable {
            System.out.println("Avant de la methode Calculate.calculate(..)");
            Object result = pjp.proceed();
            System.out.println("⬅️ Après appel de calculate(...)");
            System.out.println("Résultat calculé : " + result);
            return result;
        }
}
