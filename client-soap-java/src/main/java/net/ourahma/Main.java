package net.ourahma;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("Mathode conversion EuroToDH :"+proxy.conversionEuroToDH(98));
        System.out.println("***************Consulter un compte ***************************");
        Compte compte = proxy.getCompte(1);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());
        System.out.println("***************Consulter la liste des comptes ***************************");
        proxy.listComptes().forEach(c ->{
            System.out.println("Code : "+c.getCode()+"Solde : "+c.getSolde()+"DateCreation : "+c.getDateCreation());
        });
    }
}