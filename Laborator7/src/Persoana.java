public class Persoana {String nume;
    public Persoana(String nume) {
        this.nume = nume;
    }
    public static void modificaNume(Persoana persoana) {
        persoana.nume = "Maria"; // Schimbăm numele
    }
    public static void main(String[] args) {
        Persoana p = new Persoana("Ion");
        System.out.println("Nume înainte de apel: " + p.nume); //Ion
        modificaNume(p);
        System.out.println("Nume după apel: " + p.nume); // Maria
    }
}
