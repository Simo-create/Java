public class Carte extends MaterialDeBiblioteca implements Imprumutabil{
    private String  autor;
    private int     numarPagini;

    public Carte(String titlu, boolean disponibilitate, String autor, int numarPagini){
        super(titlu, disponibilitate);
        this.autor = autor;
        this.numarPagini = numarPagini;
    }

    @Override
    public void descriereMaterial(){
        System.out.println("Cartea cu titlul" + super.getTitlu() + " si autorul" +  autor
                + "are " +numarPagini+" pagini.");

    }

    @Override
    public void imprumuta(){

    }

    @Override
    public void returneaza(){

    }
}
