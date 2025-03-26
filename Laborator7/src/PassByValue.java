public class PassByValue {
    private int numar;
    private double valoare;

    public PassByValue(int numar, double valoare)
    {
        this.numar = numar;
        this.valoare = valoare;
    }

    public int getNumar() {
        return numar;
    }

    public double getValoare() {
        return valoare;
    }

    public void afisarenumar(){
        int numar = 5;
        int valoare =7;
        System.out.println("Afisare in metoda numar = " + numar);
        System.out.println("Afisare in metoda valoare = " + valoare);
    }
}
