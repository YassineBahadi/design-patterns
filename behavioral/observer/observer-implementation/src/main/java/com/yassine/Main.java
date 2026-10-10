package com.yassine;

import com.yassine.obs.*;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Observer observer1=new ObserverImpl1();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(10);
        observable.setState(20);
        observable.setState(30);
        observable.setState(40);
    }
}