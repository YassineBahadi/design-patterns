package com.yassine;

import com.yassine.computer.Ecran;
import com.yassine.computer.SuperVP;
import com.yassine.computer.TV;
import com.yassine.computer.UniteCentrale;
import com.yassine.computer.adapter.HdmiVgaAdapter;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new TV());
        uniteCentrale.setVga(adapter);
        adapter.print("Bonsoir GLSID");

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Hello");
    }
}