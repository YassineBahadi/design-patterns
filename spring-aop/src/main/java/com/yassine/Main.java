package com.yassine;

import com.yassine.service.IMetier;
import com.yassine.service.SecurityContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            SecurityContext.authenticate("14N13B14", "14N13B14", new String[]{"USER", "ADMIN"});
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
            IMetier metier = applicationContext.getBean(IMetier.class);
            System.out.println("*************************");
            System.out.println(metier.getClass().getName());
            System.out.println("*************************");
            metier.process();
            System.out.println(metier.compute());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

@Configuration
@ComponentScan(value = {"com.yassine"})
class MyConfig{

}