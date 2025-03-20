import  java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int[] numere = {1,2,3,4,5};
        for (int i = 0; i < numere.length; i++) {
            System.out.println("Elementul i = " + i+ "este" + numere[i]);
        }
        numere[2] = 10;
        for (int i = 0; i < numere.length; i++) {
            System.out.println("Elementul i = " + i+ "este" + numere[i]);
        }

        int[] a;
        int[] b = new int[3]; //aloca memorie pentru 3 elem
        int[] c = {1,2,3};

        System.out.println("Acum afisez c[0] ="+ c[0]);

        System.out.println("Acum afisez c[1] ="+ c[1]);

        List<String> listaDeNume = new ArrayList<>();
        listaDeNume.add("Cosmina");
        listaDeNume.add("Ion");
        listaDeNume.add("Mihai");

        System.out.println(listaDeNume.get(0));

    }
}