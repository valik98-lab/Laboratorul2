package com.company.incapsulare;

public class Laptop {
        private String tipul;
        private  String procesor;
        private int memorie;
        private String culoare;
        private float diagonala;

        public Laptop ( String tipul ,String procesor, int memorie, String  culoare  ,float diagonala)
        {
            this.tipul = tipul;
            this.procesor = procesor;
            this.memorie = memorie;
            this.culoare = culoare;
            this.diagonala = diagonala;

        }

        public String getTipul () {
            return this.tipul;
        }

        public String getProcesor() {
            return this.procesor;
        }

        public int getMemorie () {
            return this.memorie;
        }

        public String getCuloare(){
            return this.culoare;
        }

        public float getDiagonala() {
            return this.diagonala;
        }

        public void setTipul() {
            this.tipul = tipul;
        }

        public void setProcesor () {
            this.procesor = procesor;
        }

        public void setMemorie () {
            this.memorie= memorie;
        }

        public void setCuloare () {
            this.culoare = culoare;
        }

        public void setDiagonala () {
            this.diagonala = diagonala;
        }
}
