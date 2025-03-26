public class Persoana {
    private String nume;
    private int varsta;
    private String gen;
    private int id;// cum e generat automat?

    private static int numardeIDuri = 0;



    public Persoana(){
        this.nume = "Necunoscut";
        this.varsta = 0;
        this.gen = "Nedefinit";
        this.id = ++numardeIDuri;
    }
    public Persoana(String nume, int varsta, String gen){

        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
        this.id = ++numardeIDuri;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getGen() {
        return gen;
    }

    public int getId() {
        return id;
    }

    public static int getNumardeIDuri() {
        return numardeIDuri;
    }

    @Override
    public String toString(){
        return "Persoana cu numele " + nume + " varsta " +varsta + " de genul " + gen
                + " are ID: " +id;

    }



}
