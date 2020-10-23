package com.company;

import com.company.incapsulare.Laptop;
import com.company.incapsulare.Telefon;
import com.company.mostenire.ierarhica.Fructe;
import com.company.mostenire.ierarhica.Locale;
import com.company.mostenire.ierarhica.Exotice;
import com.company.mostenire.simpla.Masina;
import com.company.mostenire.simpla.Toyota;


public class Main {

    public static void main(String[] args) {

        //Pentru clasa Laptop

        Laptop laptop = new Laptop("Lenova", "Intel", 64, "Negru", 16.5F);

        System.out.println("----------------------------");

        System.out.println(laptop.print());

        System.out.println("----------------------------");

        laptop.setTipul("Acer");
        System.out.println(laptop.print());

        System.out.println("----------------------------");

        laptop.setCuloare("Roz");
        System.out.println(laptop.print());

        System.out.println("----------------------------");

        System.out.println(laptop.getMemorie());

        //Pentru clasa Telefon

        System.out.println("----------------------------");

        Telefon telefon = new Telefon("Samsung", 1000, "Albastru", 2700F);
        System.out.println(telefon.print());

        System.out.println("----------------------------");

        telefon.setCuloare("Negru");
        System.out.println(telefon.print());

        System.out.println("----------------------------");

        System.out.println(telefon.getPret(5000));

        System.out.println("----------------------------");

        telefon.setMemorie(256);
        System.out.println(telefon.print());

        System.out.println("----------------------------");

        //Mostenire simpla

        Masina car = new Masina("BMW","rosie",160F,90);
        System.out.println(car.print());

        System.out.println("----------------------------");

        car.setPutere(150);
        System.out.println(car.print());

        System.out.println("----------------------------");

        Toyota nr = new Toyota("Corola","motorina");
        System.out.println(nr.print());

        System.out.println("----------------------------");


        Fructe tip1 = new Fructe("castraveti", "verde", 200F, "oval");
        System.out.println(tip1.print());

        System.out.println("----------------------------");

        Locale name = new Locale("castraveti",
                "verde",
                200F,
                "oval",
                "simpli",
                "autohton");

        System.out.println(name.print());

        System.out.println("----------------------------");

        Exotice imp = new Exotice("Clemantine",
                "orange",
                80F,
                "sfera",
                "America");

        System.out.println(imp.print());
    }
}

