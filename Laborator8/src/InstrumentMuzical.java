abstract class InstrumentMuzical {
    public String tip;
    public double pret;

    public InstrumentMuzical(String tip, double pret){
        this.tip = tip;
        this.pret = pret;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public abstract void canta();

    public void afiseazaDetalii(){
        System.out.println("Instrument de tip: " + getTip() +" care are pretul de: " + getPret());
    }

    public static void descriereInstrument(){
        System.out.println("Instrumentul muzical scoate sunete.");
    }
}
