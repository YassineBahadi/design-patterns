package com.yassine.decorateur;

import com.yassine.composants.Boisson;

/**
 * @author pc
 **/
public class Noisette extends  Decorateur{

    public Noisette(Boisson boisson) {
        super(boisson);
    }


    @Override
    public double cout() {
        return 1.5+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Noisette";
    }
}
