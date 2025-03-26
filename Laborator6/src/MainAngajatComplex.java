public class MainAngajatComplex {
    public static void main(String[] args) {
        AngajatComplex angajatcomplex = new AngajatComplex("Misu", 1000);
        AngajatComplex angajatcomplex1 = new AngajatComplex("Gica", 2500);

        System.out.println("Angajatul cu nume " + angajatcomplex.getNume() +
                " cu salariul de "
                + angajatcomplex.getSalariu() +
                " primeste bonus de " + angajatcomplex.calculeazaBonus(10));
        System.out.println("Angajatul cu nume " + angajatcomplex1.getNume() +
                " cu salariul de "
                + angajatcomplex1.getSalariu() +
                " primeste un bonus de " + angajatcomplex1.calculeazaBonus(20.0));

    }
}
