package com.yassine;

import com.yassine.context.Context;
import com.yassine.strategy.Strategy;
import com.yassine.strategy.StrategyImpl1;
import com.yassine.strategy.StrategyImpl2;
import com.yassine.strategy.StrategyImpl3;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        Map<String,Strategy> strategyMap=new HashMap<>();
        Strategy strategy;
        while(true){
            System.out.println("Enter strategy : ");
            String str=scanner.nextLine();
            strategy=strategyMap.get(str);
            if(strategy==null){
                System.out.println("Creation d'un nouvel objet de StrategyImpl"+str);
                strategy=(Strategy) Class.forName("com.yassine.strategy.StrategyImpl"+str).getConstructor().newInstance();
                strategyMap.put(str,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}