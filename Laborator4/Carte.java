

public class Carte {
    int nrPagini;
    String titlu;


    public Carte(String titlu, int nrPagini)
    {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public String getTitlu(){
        return titlu;
    }


    public static int carteaCuMaiMultePagini(Carte carte1, Carte carte2)
    {
        if(carte1.getNrPagini() > carte2.getNrPagini())
        {
            System.out.println("Cartea cu mai multe pagini este: " + carte1.getTitlu());
            return carte1.getNrPagini();
        }else
        {
            System.out.println("Cartea cu mai multe pagini este: " + carte2.getTitlu());
            return carte2.getNrPagini();
        }

    }
}
