public class MainPatratComplex {
    public static void main(String[] args) {

        PatratComplex patratComplex = new PatratComplex(5);
        PatratComplex patrat = new PatratComplex(7);

        System.out.println(patratComplex.Arie());
        System.out.println(patratComplex.Perimetru());

        patratComplex.AfisareComplexa();

        PatratComplex p1 = new PatratComplex(2);
        PatratComplex p2 = new PatratComplex(3);

        patratComplex.AfisareObiecte();

        p1.afisarePersonalizata("Patratul p1 are ");

        patrat.setLatura(9,2);
        patrat.afisareLatura();


    }

}
