package com.yassine.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Scanner;

/**
 * @author pc
 **/
@Aspect
public class SecurityAspect {
    @Pointcut("execution(* com.yassine.test.Main.start(..))")
    public void startAppPointCut(){}

    @Around("startAppPointCut()")
    public void autourStart(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Username:");
        String username=scanner.next();
        System.out.print("Password:");
        String password=scanner.next();
        if(username.equals("14N13BL4")&& password.equals("14N13BL4")){
            proceedingJoinPoint.proceed();
        }
        else{
            System.out.println("Wrong password or username entered");
        }
    }
}
