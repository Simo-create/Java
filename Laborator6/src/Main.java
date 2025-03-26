public class Main {
    public static void main(String[] args) {

        Masina masina = new Masina(240,5);
        Motocicleta motocicleta = new Motocicleta(120,"atas");

        System.out.println(masina.descriere());
        System.out.println(motocicleta.descriere());
    }
}