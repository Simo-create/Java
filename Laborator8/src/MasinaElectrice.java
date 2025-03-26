public class MasinaElectrice extends Vehicul implements Electric{

    public MasinaElectrice(int vitezaMaxima, String marca) {
        super(vitezaMaxima, marca);
    }

    public MasinaElectrice() {
    }

    @Override
    public void porneste(){
        System.out.println("MasinaElectrica porneste.");
    }

    @Override
    public void opreste(){
        System.out.println("Masina electrica se opreste.");
    }

    public void incarca(){
        System.out.println("Masina electrica se incarca");
    }

    public void verificaBaterie(){
        System.out.println("Masina electrica verifica bateria.");
    }
}
