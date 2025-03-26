public class Mainbiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("scolara");

        Biblioteca.Carte biblcarte = new Biblioteca.Carte("Poezii","Ion", biblioteca);

        biblcarte.afiseazaDetalii();

    }
}
