package com.yassine;

import com.yassine.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@ComponentScan(basePackages = {"com.yassine.service"})
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Main.class);
        IMetier metier=applicationContext.getBean(IMetier.class);
        metier.process();
        System.out.println(metier.compute());

    }
}