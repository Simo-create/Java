class Imprimante extends Echipament{


    public Imprimante(String denumire, String nr_inv,
                      double pret, String zona_mag,
                      String stare, int ppm, double dpi,
                      int p_car, String mod_tiparire){
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;

    }

    private int ppm;
    private double dpi;
    private int p_car;
    private String mod_tiparire;

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public double getRezolutie() {
        return dpi;
    }

    public void setRezolutie(double dpi) {
        this.dpi = dpi;
    }

    public int getP_car() {
        return p_car;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public String getMod_tiparire() {
        return mod_tiparire;
    }

    public void setMod_tiparire(String mod_tiparire) {

        this.mod_tiparire = mod_tiparire;
        System.out.println("Set mod de tiparire");
    }

    @Override
    public String toString(){
        return super.toString()+ " Se imprima pe minut " + ppm +
                " cu rezolutia " + dpi
                + " si si se pot imprima pe cartus un numar de " + p_car + " pagini "
                + " in mod de tiparire "+ mod_tiparire;

    }
}
