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

        public void setTipul(String tipul) {

            this.tipul = tipul;
        }

        public void setProcesor (String procesor ) {
            this.procesor = procesor;
        }

        public void setMemorie (int memorie) {
            this.memorie= memorie;
        }

        public void setCuloare (String culoare) {

            this.culoare = culoare;
        }

        public void setDiagonala (float diagonala) {

            this.diagonala = diagonala;
        }
        public String print(){
            return "Tipul:" + this.tipul + "\n" +
                    "Procesor:" + this.procesor + "\n" +
                    "Memorie:" + this.memorie + "\n" +
                    "Culoare:" + this.culoare + "\n" +
                    "Diagonala:" + this.diagonala + "\n";
        }
}
