package com.yassine.test;

import com.yassine.metier.Compte;
import com.yassine.metier.IMetierBanque;
import com.yassine.metier.MetierBanqueImpl;

import java.util.Scanner;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Message from Main Application");
        new Main().start();
    }

    public void start() {

        System.out.println("Démarrage de l'application");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Donner le code du compte :");
        long code=scanner.nextLong();
        System.out.print("Donner le solde initiale du compte :");
        double solde=scanner.nextDouble();
        IMetierBanque metierBanque=new MetierBanqueImpl();
        metierBanque.addCompte(new Compte(code,solde));
        while(true){
            try {
                System.out.print("Type Opération:");
                String type = scanner.next();
                if(type.equals("quitter")) break;
                System.out.print("Montant :");
                double montant = scanner.nextDouble();
                if (type.equals("v")) {
                    metierBanque.verser(code, montant);
                } else if (type.equals("r")) {
                    metierBanque.retirer(code, montant);
                }
                Compte compte = metierBanque.consulter(code);
                System.out.println("Etat du compte" + compte.toString());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Fin du application");



    }
}