package com.exemplu.vizibilitate;

public class Persoana {

        public String nume;
        protected String prenume;
        int varsta;
        private String CNP;

    public Persoana(String nume, String prenume, int varsta, String CNP){
            this.nume = nume;
            this.prenume = prenume;
            this.varsta = varsta;
            this.CNP = CNP;
        }

        public void detaliiVizibilitate () {
            System.out.println("Persoana " + nume + " are " + CNP);
        }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", CNP='" + CNP + '\'' +
                '}';
    }
}
