package com.yassine;

import com.yassine.composants.Boisson;
import com.yassine.composants.Espresso;
import com.yassine.composants.Sumatra;

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
        boisson=new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}