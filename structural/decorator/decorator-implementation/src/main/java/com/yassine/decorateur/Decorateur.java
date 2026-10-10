package com.yassine.decorateur;

import com.yassine.composants.Boisson;

/**
 * @author pc
 **/
public abstract class Decorateur extends Boisson {
    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
}
