package com.yassine;

import com.yassine.context.Context;
import com.yassine.strategy.Strategy;
import com.yassine.strategy.StrategyImpl1;
import com.yassine.strategy.StrategyImpl2;
import com.yassine.strategy.StrategyImpl3;

import java.util.Scanner;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Context context=new Context();
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Enter strategy : ");
            String str=scanner.nextLine();
            Strategy strategy=(Strategy) Class.forName("com.yassine.strategy.StrategyImpl"+str).newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}