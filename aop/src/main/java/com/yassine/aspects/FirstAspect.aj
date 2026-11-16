package com.yassine.aspects;

/**
 @author pc
 **/
public aspect FirstAspect {
    pointcut pc1(): execution(* com.yassine.test.Main.main(..));

//    before():pc1(){
//        System.out.println("============================================");
//        System.out.println("Before main from Aspect with AspectJ syntax");
//        System.out.println("============================================");
//    }
//
//    after():pc1(){
//        System.out.println("============================================");
//        System.out.println("After main from Aspect with AspectJ syntax");
//        System.out.println("============================================");
//    }

    void around():pc1(){
        System.out.println("============================================");
        System.out.println("Before main from Aspect with AspectJ syntax");
        System.out.println("============================================");
//        execution de l'operation
        proceed();
        System.out.println("============================================");
        System.out.println("After main from Aspect with AspectJ syntax");
        System.out.println("============================================");
    }
}
