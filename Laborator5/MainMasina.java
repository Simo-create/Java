public class MainMasina {
    public static void main(String[] args) {
        Motor motor = new Motor("Diesel", 150);
   //     Masina masina1 = new Masina();
        Masina masina2 = new Masina("BMW", 2000, motor);
        Masina masina3 = new Masina("Toyota", 2000, motor);

    System.out.println("Masina2 este: " +  masina2.getBrand()
            + " si are capacitatea cilindrica de " + masina2.getCC());

    System.out.println("Masina2 este: " +  masina2.getBrand()
            + " si are capacitatea cilindrica de " + masina2.getCC());

    System.out.println(masina3);
    System.out.println(masina2.toString());

    }
}