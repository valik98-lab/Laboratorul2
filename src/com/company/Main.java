package com.company;

import com.company.incapsulare.Laptop;
import com.company.incapsulare.Telefon;

public class Main {

    public static void main(String[] args) {

        //Pentru clasa Laptop

	Laptop laptop = new Laptop("Lenova","Intel",64,"Negru",16.5F);

	System.out.println(laptop.print());

	laptop.setTipul("Acer");
	System.out.println(laptop.print());

	laptop.setCuloare("Rosie");
	System.out.println(laptop.print());

	System.out.println(laptop.getMemorie());

	//Pentru clasa Telefon

        Telefon telefon = new Telefon("Samsung",1000,"Albastru",2700F);
        System.out.println(telefon.print());

        telefon.setCuloare("Negru");
        System.out.println(telefon.print());

        System.out.println(telefon.getPret(5000));

        telefon.setMemorie(256);
        System.out.println(telefon.print());


    }

}
