package net.ensah.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FirstAspect {

        @Pointcut("execution(void net.ensah.Main.main(..))")
        public void p1(){}

      @Before("p1()")
      public void FirstMessage(){
          System.out.println("***************");
          System.out.println("First Message Before Main");
          System.out.println("***************");
      }

        @After("p1()")
        public void LastMessage(){
            System.out.println("***************");
            System.out.println("Last Message After Main");
            System.out.println("***************");
        }
}
