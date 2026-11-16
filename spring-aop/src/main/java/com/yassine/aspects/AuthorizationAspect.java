package com.yassine.aspects;

import com.yassine.service.SecurityContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author pc
 **/
@Component
@Aspect
@EnableAspectJAutoProxy
public class AuthorizationAspect {

    @Around(value = "@annotation(securedByAspect)",argNames ="pjp,securedByAspect")
    public Object secure(ProceedingJoinPoint pjp,SecuredByAspect securedByAspect) throws Throwable {
        String[] roles=securedByAspect.roles();
        boolean authorized=false;
        for(String role:roles){
            if(SecurityContext.hasRole(role)){
                authorized=true;
                break;
            }
        }
        if(authorized){
            Object result=pjp.proceed();
            return result;
        }
        throw new RuntimeException("Unauthorized:::403 to access this resource : "+ pjp.getSignature());
    }
}
