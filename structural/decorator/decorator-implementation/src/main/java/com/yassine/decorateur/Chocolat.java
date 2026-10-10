package com.yassine.decorateur;

import com.yassine.composants.Boisson;

/**
 * @author pc
 **/
public class Chocolat extends  Decorateur{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }


    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Chocolat";
    }
}
