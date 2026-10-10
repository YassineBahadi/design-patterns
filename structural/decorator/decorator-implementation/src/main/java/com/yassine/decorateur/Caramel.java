package com.yassine.decorateur;

import com.yassine.composants.Boisson;

/**
 * @author pc
 **/
public class Caramel extends  Decorateur{

    public Caramel(Boisson boisson) {
        super(boisson);
    }


    @Override
    public double cout() {
        return 0.8+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }
}
