package com.yassine;

/**
 * @author pc
 **/
public class Context {

    public void effectuerOperation(int type){
        if(type==1){
        System.out.println("**************");
        System.out.println("------Stratégie1--------");
        System.out.println("================");
        }
        else if(type==2){
            System.out.println("**************");
            System.out.println("------Stratégie2--------");
            System.out.println("================");
        }
        else if(type==3){
            System.out.println("**************");
            System.out.println("------Stratégie3--------");
            System.out.println("================");
        }
        else {
            System.out.println("**************");
            System.out.println("------Stratégie Par Défaut--------");
            System.out.println("================");
        }
    }
}
