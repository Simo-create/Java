public class ContBancar {
    private String proprietar;
    private double sold;

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double soldInitial) {
        this.sold = soldInitial;
    }

    public void depunere(double suma){
        if (suma > 0)
        {
            sold = sold+suma;
            System.out.println("Soldul contului este: "+ sold + " lei'");
        }
        else {
            System.out.println("Eroare la valoarea sumei");
        }

    }

    public void  retragere(double suma){

        if(suma <= sold)
        {
            sold -=suma;
            System.out.println("Soldul contului este:" + sold +"lei.");
        }
        else {
            if (suma > sold)
            {
                System.out.println("Fonduri insuficiente");
            }
        }
    }
}
