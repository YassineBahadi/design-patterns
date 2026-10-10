package com.yassine;

import com.yassine.composants.Boisson;
import com.yassine.composants.Espresso;
import com.yassine.composants.Sumatra;
import com.yassine.decorateur.Caramel;
import com.yassine.decorateur.Chocolat;
import com.yassine.decorateur.Noisette;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************");
        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************");
        boisson=new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************");
        boisson=new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}