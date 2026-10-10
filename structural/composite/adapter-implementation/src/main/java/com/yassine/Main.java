package com.yassine;

import com.yassine.computer.Ecran;
import com.yassine.computer.UniteCentrale;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Hello World");
        uniteCentrale.setVga(new Tv());
    }
}