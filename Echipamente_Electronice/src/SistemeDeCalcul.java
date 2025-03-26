class SistemeDeCalcul extends Echipament{


    private String tip_monitor;
    private double vit_proc;
    private double c_hdd;
    private String sistoperare;

    public SistemeDeCalcul(String denumire, String nr_inv,
                           double pret, String zona_mag,
                           String stare, String tip_monitor,
                           double vit_proc, double c_hdd, String sistoperare){
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.tip_monitor = tip_monitor;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistoperare = sistoperare;
    }

    public String getTip_monitor() {
        return tip_monitor;
    }

    public void setTip_monitor(String tip_monitor) {
        this.tip_monitor = tip_monitor;
    }

    public double getVit_proc() {
        return vit_proc;
    }

    public void setVit_proc(double vit_proc) {
        this.vit_proc = vit_proc;
    }

    public double getC_hdd() {
        return c_hdd;
    }

    public void setC_hdd(double c_hdd) {
        this.c_hdd = c_hdd;
    }

    public String getSistoperare() {
        return sistoperare;
    }

    public void setSistoperare(String sistoperare) {
        this.sistoperare = sistoperare;
    }

    @Override
    public String toString(){
        return super.toString() + " Sistemul de calcul are monitorul " + tip_monitor +
                " viteza procesorului  " + vit_proc
                + " capacitatea HDD " + c_hdd + " si sistem de operare "
                + sistoperare;

    }
}
