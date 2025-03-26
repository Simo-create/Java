class Trompeta extends InstrumentMuzical {

    public Trompeta(String tip, double pret){
        super(tip, pret);
    }

    @Override
    public void canta() {
        System.out.println("Trompeta cântă o melodie frumoasă.Ta Ta.");
    }
}
