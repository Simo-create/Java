

public class Autor {

    String titlu;
    String autor;
    int nrPagini;


    public Autor(String autor, String titlu, int nrPagini)
    {
        this.autor = autor;
        this.titlu = titlu;
        this.nrPagini = nrPagini;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public String getTitlu(){
        return titlu;
    }


    public static String carteaCuAcelasiAutor(Autor carte1, Autor carte2)
    {
        if(carte1.getAutor() == carte2.getAutor())
        {
            System.out.println("Cartile au acelasi autor: " + carte1.getAutor());
            return carte1.getAutor();
        }else
        {
            System.out.println("Cartile nu au acelasi autor");
            return carte2.getAutor();
        }

    }
}
