public class TrimitereprinValoare {
    public static void modificaValoare(int numar) {
        numar = 100;
        System.out.println("În metodă: numar = " + numar); // 100
    }
    public static void main(String[] args) {
        int numar = 50;
        System.out.println("Înainte de apel: numar = " + numar); //

        modificaValoare(numar);
        System.out.println("După apel: numar = " + numar); // 50
    }
}

