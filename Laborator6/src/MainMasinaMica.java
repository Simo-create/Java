public class MainMasinaMica {
    public static void main(String[] args) {

        Motor motor = new Motor(100);
        MasinaMica masina = new MasinaMica(motor);

        System.out.println(masina.descriere());




    }
}
