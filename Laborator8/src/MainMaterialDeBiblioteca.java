public class MainMaterialDeBiblioteca {
    public static void main(String[] args) {

    Carte carte = new Carte("Enciclopedie", true, "Academia", 350);
    Carte carte1 = new Carte("Povesti", true, "ion Creanga", 90);
    Carte carte2 = new Carte("O scrisoare pierduta", false, "I.L.Caragiale", 89);
    Revista revista = new Revista("Formula AS", true, 5);
    Revista revista1 = new Revista("Rebus", true, 2);


    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adaugaMaterial(new Carte("Enciclopedie", true, "Academia", 350));
    biblioteca.adaugaMaterial(new Carte("Povesti", true, "ion Creanga", 90));
    biblioteca.adaugaMaterial(new Revista("Formula AS", false, 5));
    biblioteca.adaugaMaterial(new Revista("Rebus", true, 2));

    biblioteca.cautareDupaTitlu("Enciclopedie");

    biblioteca.afiseazaMaterialeDinBiblioteca();

    biblioteca.imprumutaDacaEPosibil("Rebus");
    biblioteca.imprumutaDacaEPosibil("Formula AS");

}
}
