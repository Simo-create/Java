public class Motor {
    //4. Definiți o clasă Motor și o clasă Masina, în care Masina are un atribut de tip
    //Motor.
    //o Compoziția arată că o mașină include un motor și nu poate funcționa fără
    //acesta
    //o Instanțiați o mașină și afișați detalii despre aceasta și motorul său.

    // Atributele motorului
    private String tip;
    private int putere; // în cai putere (CP)

    public Motor(String tip, int putere){
        this.tip = tip;
        this.putere = putere;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    // Suprascrierea metodei toString() pentru a afișa detalii despre motor
    @Override
    public String toString() {
        return "Motorul este de tip " + tip + " cu o putere de " + putere + " CP";
    }
}
