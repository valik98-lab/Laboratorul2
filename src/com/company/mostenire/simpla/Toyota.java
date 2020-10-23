package com.company.mostenire.simpla;

public class Toyota extends Masina {
    private String tip;
    private String combustibil;

    public Toyota(String tip, String combustibil) {
        super("ToyotaPrius", "neagra", 150F, 70);
        this.tip = tip;
        this.combustibil = combustibil;
    }

    public String getTip() {
        return this.tip;
    }

    public String getCombustibil() {
        return this.combustibil;
    }


    public void setTipul(String tip) {
        this.tip = tip;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }
    @Override
    public String print() {
        return super.print() + "Tipul: " + this.tip + "\n" +
                "Combustibil: " + this.combustibil;
    }

}

