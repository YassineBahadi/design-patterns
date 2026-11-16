package com.yassine.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * @author pc
 **/
@Aspect
public class LoggingAspect {
    Logger logger=Logger.getLogger(LoggingAspect.class.getName());
//    long t1,t2;

    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }

    @Pointcut("execution(* com.yassine.metier.MetierBanqueImpl.*(..))")
    public void pc1(){}

//    @Before("pc1()")
//    public void avant(JoinPoint joinPoint){
//       t1=System.currentTimeMillis();
//        logger.info("-----------------------------------------------");
//        logger.info("Avant l'exécution de la méthode "+joinPoint.getSignature());
//    }
//
//    @After("pc1()")
//    public void apres(JoinPoint joinPoint){
//        logger.info("Après l'exécution de la méthode "+joinPoint.getSignature());
//        t2=System.currentTimeMillis();
//        logger.info("Durée de l'exécution de la méthode "+(t2-t1));
//        logger.info("-----------------------------------------------");
//    }

    @Around("pc1()")
    public Object autour(ProceedingJoinPoint proceedingJoinPoint,JoinPoint joinPoint) throws Throwable {
        long t1=System.currentTimeMillis();
        logger.info("-----------------------------------------------");
        logger.info("Avant l'exécution de la méthode "+joinPoint.getSignature());
        Object result= proceedingJoinPoint.proceed();
        logger.info("Après l'exécution de la méthode "+joinPoint.getSignature());
        long t2=System.currentTimeMillis();
        logger.info("Durée de l'exécution de la méthode "+(t2-t1));
        logger.info("-----------------------------------------------");
        return result;
    }
}
