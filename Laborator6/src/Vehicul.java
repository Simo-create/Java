public class Vehicul {
    private int vitezaMaxima;

    public Vehicul(int vitezaMaxima){
        this.vitezaMaxima = vitezaMaxima;
    }

    public String descriere(int vitezaMaxima){
        return "Vehicul cu viteza maxima: "+ vitezaMaxima;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
}
