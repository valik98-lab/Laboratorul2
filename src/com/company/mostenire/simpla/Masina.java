package com.company.mostenire.simpla;

public class Masina {
    private String marca;
    private String culoare;
    private float viteza;
    private int putere;

    public Masina (String marca, String culoare, float viteza, int putere){
        this.marca = marca;
        this.culoare = culoare;
        this.viteza = viteza;
        this.putere = putere;
    }
    public String getMarca () {
        return this.marca;
    }

    public String getCuloare() {
        return this.culoare;
    }

    public float getViteza () {
        return this.viteza;
    }

    public int getPutere(){

        return this.putere;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public void setCuloare (String culoare) {
        this.culoare = culoare;
    }

    public void setViteza ( float viteza) {
        this.viteza = viteza;
    }

    public void setPutere (int  putere) {
        this.putere = putere;
    }
    public String print()
    {
        return "Marca: " + this.marca + "\n" +
                "Culoarea: " + this.culoare + "\n" +
                "Viteza: " + this.viteza + "\n" +
                "Puterea: " + this.putere + "\n";
    }
}
