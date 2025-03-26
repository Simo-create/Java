public class Masina extends Vehicul {
    private int numarUsi;

    public Masina(int vitezaMaxima, int numarUsi) {
        super(vitezaMaxima);
        this.numarUsi = numarUsi;

    }


    public String descriere() {
        return "Vehicul cu numar de usi: " + numarUsi + "si poate avea viteza maxima: "
                + getVitezaMaxima();
    }
}
