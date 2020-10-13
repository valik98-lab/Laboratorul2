package com.company.mostenire.ierarhica;

public class Fructe {

        private String nume;
        private String culoare;
        private float greutate;
        private String forma;
        public Fructe (String nume, String culoare, float greutate, String forma)
        {
            this.nume = nume;
            this.culoare = culoare ;
            this.greutate = greutate;
            this.forma= forma;
        }

        public String getNume()
        {
            return this.nume;
        }

        public String getCuloare()
        {
            return this.culoare;
        }

        public float getGreutate()
        {
            return this.greutate;
        }

        public String getForma()
        {
            return this.forma;
        }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setCuloare(String culoare)
    {
        this.culoare = culoare;
    }

    public void setGreutate(float greutate)
    {
        this.greutate = greutate;
    }

    public void setForma(String forma)
    {
        this.forma= forma;
    }

    public String print()
    {
        return "Nume:" + this.nume + "\n" +
                "Culoarea: " + this.culoare + "\n" +
                "Greutatea: " + this.greutate + "\n" +
                "Forma: " + this.forma+ "\n";
    }


}
