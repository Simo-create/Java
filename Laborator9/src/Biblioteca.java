public class Biblioteca {

    private String nume;

    public Biblioteca(String nume){
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    static class Carte{
        private String titlu;
        private String autor;
        private Biblioteca biblioteca;

        public Carte(String titlu, String autor, Biblioteca biblioteca) {
            this.titlu = titlu;
            this.autor = autor;
            this.biblioteca = biblioteca;
        }

        public void afiseazaDetalii(){
            System.out.println("Cartea cu titlul " + titlu + " are autorul "+ autor
                    + "si este " + biblioteca.getNume());
        }


    }
}
