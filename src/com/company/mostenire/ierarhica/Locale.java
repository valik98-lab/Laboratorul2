package com.company.mostenire.ierarhica;


public class Locale extends Fructe{
    private String tipul;
    private String producator;
    public Locale( String nume, String culoare, float greutate, String forma, String tipul, String producator)

    {
        super(nume, culoare, greutate, forma);
        this.tipul= tipul;
        this.producator = producator;
    }

    public String getTipul()
    {
        return this.tipul;
    }

    public String getProducator()
    {
        return this.producator;
    }


    public void setTipul(String tipul)
    {
        this.tipul = tipul;
    }

    public void setProducator(String producator)
    {
        this.producator = producator;
    }
    
    @Override
    public String print()
    {
        return super.print() + "Tipul: " + this.tipul + "\n" +
                "Producator: " + this.producator;
    }
}
