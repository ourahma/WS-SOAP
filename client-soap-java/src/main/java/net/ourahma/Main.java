package net.ourahma;

import proxy.BanqueService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("Mathode conversion EuroToDH :"+proxy.conversionEuroToDH(98));
    }
}