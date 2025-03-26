public class AngajatComplex {
    private String nume;
    private double salariu;

    public AngajatComplex(String nume, double salariu){
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public double calculeazaBonus(double procent){
        double bonus;
        bonus = salariu*procent/100;
        return bonus;
    }


    public double calculeazaBonus(int sumaFixa){
       return sumaFixa;
    }
}
