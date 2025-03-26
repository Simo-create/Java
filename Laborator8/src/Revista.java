public class Revista extends MaterialDeBiblioteca implements Imprumutabil{
    private int numarLuna;

    public Revista(String titlu, boolean disponibilitate, int numarLuna){
        super(titlu, disponibilitate);
        this.numarLuna = numarLuna;
    }

    @Override
    public void descriereMaterial(){
        System.out.println("Revista are titlul "+ getTitlu()+ "si numar pe luna "
                + numarLuna);
    }

    public void imprumuta(){

    }

    public void returneaza(){

    }
}
