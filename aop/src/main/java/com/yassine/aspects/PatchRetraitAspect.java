package com.yassine.aspects;

import com.yassine.metier.Compte;
import com.yassine.metier.MetierBanqueImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author pc
 **/
@Aspect
public class PatchRetraitAspect {
    @Pointcut("execution(* com.yassine.metier.MetierBanqueImpl.retirer(..))")
    public void pc1(){}

    @Around("pc1() && args(code,montant)")
    public Object autourRetirer(Long code,double montant,  ProceedingJoinPoint proceedingJoinPoint, JoinPoint joinPoint) throws Throwable {
        MetierBanqueImpl metierBanque=(MetierBanqueImpl) joinPoint.getTarget();
        Compte compte=metierBanque.consulter(code);
        if(compte.getSolde()<montant) throw new RuntimeException("Solde insuffisant");
        return proceedingJoinPoint.proceed();
    }

}
