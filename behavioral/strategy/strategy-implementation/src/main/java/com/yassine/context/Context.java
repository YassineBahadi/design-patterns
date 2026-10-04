package com.yassine.context;

import com.yassine.strategy.DefaultStrategyImpl;
import com.yassine.strategy.Strategy;

/**
 * @author pc
 **/
public class Context {
    private Strategy strategy=new DefaultStrategyImpl();
    public void effectuerOperation(){
       System.out.println("********************");
       strategy.operationStrategy();
       System.out.println("======================");
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
