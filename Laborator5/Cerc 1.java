public class Cerc {
    private double raza;
    private String culoare;

    public Cerc(){
        this.raza = 1.0;
        this.culoare = "alb";
    }

    public Cerc(double raza, String culoare){
        this.raza = raza;
        this.culoare = culoare;
    }

    @Override
    public String toString(){

        return "Cercul are raza X = " + raza+ " si culoarea " + culoare;

    }

    public double getRaza()
    {
        return raza;
    }

    public double getArie(){
        return Math.PI*Math.pow(raza,2);

    }

    // comparati doua cercuri dupa raza
    public static Cerc comparaCercuri(Cerc c1, Cerc c2){
        if(c1.raza > c2.raza)
        {
            return c1;
        }
        else{
            return c2;
        }
    }

}
