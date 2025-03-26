public class MainPersoana {
    public static void main(String[] args) {

        Persoana persoana1 = new Persoana();
        Persoana persoana2 = new Persoana("Mihai", 26, "masculin");

        System.out.println("Persoana cu nume " + persoana1.getNume() +
                " cu varsta de "
                + persoana1.getVarsta() +
                " este de genul " + persoana1.getGen());

        System.out.println(persoana1.toString());
        System.out.println(persoana2.toString());
    }
}
