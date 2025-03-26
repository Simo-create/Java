import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Echipament {

    Scanner scanner = new Scanner(System.in);
    List<Echipament> echipamente = new ArrayList<>();

    private String denumire;
    private String nr_inv;
    private double pret;
    private String zona_mag;
    private String stare;

    public Echipament(String denumire, String nr_inv, double pret, String zona_mag, String stare){
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stare = stare;
    }

    public void adaugareEchipament(Echipament echipament){
        echipamente.add(echipament);
    }

     public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(String nr_inv) {
        this.nr_inv = nr_inv;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }


    public void afisareProduse(){
        System.out.println(" Afisare produse din lista");
        for (Echipament echipament : echipamente){
            System.out.println(echipament);
        }
    }

    public void modificareStareAchizitionat(){
        System.out.println(" Afisare produse din lista");
        for (Echipament echipament : echipamente){
            if(echipament.stare.equalsIgnoreCase("vandut")){
                stare = "achizitionat";
            }
            System.out.println(echipament);
        }
    }

    public void modificareStareVandut(){
        System.out.println(" Afisare produse din lista");
        for (Echipament echipament : echipamente){
            if(echipament.stare.equalsIgnoreCase("achizitionat")){
                stare = "vandut";
            }
            System.out.println(echipament);
        }
    }

    public void modificareStareExpus(){
        System.out.println(" Afisare produse din lista");
        for (Echipament echipament : echipamente){
            if(echipament.stare.equalsIgnoreCase("expus")){
                stare = "vandut";
            }
            System.out.println(echipament);
        }
    }

    public void echipamenteVandute(){
        System.out.println(" Afisare echipamente vandute");
        int nrCopiatoare = 0;
        for (Echipament echipament : echipamente) {
            if (echipament.toString().equalsIgnoreCase("Copiator"))
                nrCopiatoare++;
        }
        System.out.println("In lista sunt " + nrCopiatoare + " Copiatoare");
    }

    public void afisareCopiatoare(){
        System.out.println(" Afisare Copiatoare din lista");
        int nrCopiatoare = 0;
        for (Echipament echipament : echipamente) {
            if (echipament.toString().equalsIgnoreCase("Copiator"))
                nrCopiatoare++;
        }
        System.out.println("In lista sunt " + nrCopiatoare + " Copiatoare");
    }

    public void afisareSistemeDeCalcul(){
        System.out.println(" Afisare Copiatoare din lista");
        int nrSistemeDeCalcul = 0;
        for (Echipament echipament : echipamente) {
            if (echipament.toString().equalsIgnoreCase("SistemDeCalcul"))
                nrSistemeDeCalcul++;
        }
        System.out.println("In lista sunt " + nrSistemeDeCalcul + " SistemDeCalcul");
    }

    public void modificareStare(){
        System.out.println(" Modificare stare echipament. ");

        System.out.println("Ce stare doriti sa setati pentru imprimante?");
        System.out.println("1 - echipament achizitionat");
        System.out.println("2 - echipament expus");
        System.out.println("3 - echipament vandut");

        int stare = scanner.nextInt();
        switch (stare) {
            case 1 -> modificareStareAchizitionat();
            case 2 -> modificareStareExpus();
            case 3 -> modificareStareVandut();
            default -> System.out.println("Optiunea nu este valida");
        }
    }

    @Override
    public String toString(){
        return "Echipament cu denumirea " + denumire +
                " numar de inventar  " + nr_inv
                + " pret " + pret + " si stare "
                + stare;

    }
}


