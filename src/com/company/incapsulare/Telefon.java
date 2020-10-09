package com.company.incapsulare;

public class Telefon {
    private String model;
    private int memorie;
    private String culoare;
    private float pret ;

    public Telefon ( String model ,int memorie ,String  culoare  ,float pret)
    {
        this.model = model;
        this.memorie = memorie;
        this.culoare = culoare;
        this.pret = pret;

    }

    public String getModel() {

        return this.model;
    }

    public int getMemorie () {

        return this.memorie;
    }

    public String getCuloare(){

        return this.culoare;
    }

    public float getPret(float pret) {

        return this.pret;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setPret() {

        this.pret = pret;
    }

    public void setMemorie(int memorie) {

        this.memorie= memorie;
    }

    public void setCuloare(String culoare ) {

        this.culoare = culoare;
    }
    public String print(){
        return "Model:" + this.model + "\n" +
                "Pret:" + this.pret + "\n" +
                "Memorie:" + this.memorie + "\n" +
                "Culoare:" + this.culoare + "\n" ;
    }
}
