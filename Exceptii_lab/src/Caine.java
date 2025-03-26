public class Caine extends Animal{

    public static void modifica(int nr){
        nr=10;
    }

    @Override
    public void sunet(){
        System.out.println("Cainele latra");
    }
}
