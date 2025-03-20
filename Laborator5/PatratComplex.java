public class PatratComplex {
    private int latura;
    private static int contor=0;

    public PatratComplex (){
        this.latura = 5;
        contor ++;
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }

    public void setLatura(int latura, int factordescalare) {
        this.latura = latura*factordescalare;
    }


    public static int getContor() {
        return contor;
    }

    public static void setContor(int contor) {
        PatratComplex.contor = contor;
    }

    public PatratComplex(int latura){
        this.latura = latura;
        contor ++;
    }

    public double Perimetru (){
        return  4*latura;
    }

    public double Arie (){

        return latura*latura;
    }

    public void AfisareComplexa (){

        System.out.println("Patratul are Aria: " + Arie() + " si Perimetrul :" + Perimetru());

    }

    public void AfisareObiecte(){
        System.out.println("S-au creat " +  contor + " obiecte PatratComplex");
    }

   public void afisarePersonalizata(String mesaj){

       System.out.println(mesaj + " Aria " + Arie() + " Perimetru " + Perimetru());
   }

   // Supraincarcarea metodelor
    // În clasa PatratComplex, creați două metode supraincărcate pentru setarea laturii:
    //o Prima metodă va accepta un singur parametru de tip int.
    //o A doua metodă va accepta doi parametri de tip int: unul pentru latura și
    //unul pentru un factor de scalare (ex. dacă latura este 5 și factorul este 2,
    //latura finală va fi 10).

    // Metodă pentru afișarea valorii curente a laturii
    public void afisareLatura() {
        System.out.println("Latura cu factorul de scalare este: " + latura);
    }

}

