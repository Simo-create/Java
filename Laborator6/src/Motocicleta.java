public class Motocicleta extends Vehicul{
    private String tipMotocicleta;

    public Motocicleta (int vitezaMaxima, String tipMotocicleta){
        super(vitezaMaxima);
        this.tipMotocicleta = tipMotocicleta;
    }


    public String descriere(){
        return "Aceasta este o motocicleta de tip ;" + tipMotocicleta+ "cu o viteza" + getVitezaMaxima();
    }
}
