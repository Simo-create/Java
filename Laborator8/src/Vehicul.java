abstract class Vehicul {
    private int         vitezaMaxima;
    private String      marca;

    public Vehicul(int vitezaMaxima, String marca) {
        this.vitezaMaxima = vitezaMaxima;
        this.marca = marca;
    }

    public Vehicul() {

    }

    public abstract void porneste();

    public abstract void opreste();

    public void afiseazaDetalii(){

        System.out.println("Vehicul cu viteza: "+ vitezaMaxima+ "de tipul "+ marca);
    }

}
