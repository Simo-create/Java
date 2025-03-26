class Copiatoare extends Echipament{
    private int p_ton;
    private String format;

    public Copiatoare(String denumire, String nr_inv, double pret,
                      String zona_mag,String stare,
                      int p_ton, String format){
        super(denumire, nr_inv, pret, zona_mag, stare) ;
        this.p_ton = p_ton;
        this.format = format;
    }

    public int getP_ton() {
        return p_ton;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString(){
        return super.toString()+ " Copiatorul poate copia " + p_ton +
                " pagini per toner in format  " + format;

    }
}
