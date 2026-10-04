package com.yassine;

import com.yassine.context.Context;
import com.yassine.strategy.StrategyImpl1;
import com.yassine.strategy.StrategyImpl2;
import com.yassine.strategy.StrategyImpl3;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
    }
}