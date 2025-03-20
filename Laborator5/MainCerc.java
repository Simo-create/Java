public class MainCerc {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc();
        Cerc cerc2 = new Cerc(2.2, "verde");

        // Afișare informații cercuri
        System.out.println(cerc1); // Output: Cercul are raza 1.0 și culoarea alb
        System.out.println(cerc2); // Output: Cercul are raza 2.5 și culoarea roșu

        // Calcul arii
        System.out.println("Aria cercului 1: " + cerc1.getArie());
        System.out.println("Aria cercului 2: " + cerc2.getArie());

        // Comparare raze a doua cercuri
        Cerc cercMaiMare = Cerc.comparaCercuri(cerc1, cerc2);
        System.out.println(cercMaiMare + " si este cel cu raza mai mare");



    }
}
