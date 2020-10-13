package com.company.mostenire.ierarhica;

public class Exotice extends Fructe{
        private String originea ;
        public Exotice (String nume, String culoare, float greutate, String forma, String originea)
        {
            super (nume, culoare, greutate, forma);
            this.originea  = originea;
        }

        public String originea()
        {
            return this.originea ;
        }

                public String print(String mesaj)
        {
            return mesaj;
        }

        public void originea (String originea)
        {
            this.originea  = originea;
        }

    @Override
    public String print()
    {
        return super.print() + "Tara de import : " + this.originea ;
    }

}


