import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3_clase5 {
    public static void lista_num(List<Integer> lista_numere)
    {
        System.out.println("Numerele din lista sunt: ");
        for (Integer numar : lista_numere){
            System.out.println(numar);
        }
        System.out.println();
    }

    public static int calculeazasuma(List<Integer> lista)
    {
        int suma = 0;
        for (Integer numar : lista)
        {
            suma = suma +numar;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List<Integer> lista_numere = new ArrayList<>();
       lista_numere.add(1);
       lista_numere.add(22);
       lista_numere.add(123);
       lista_numere.add(11);

        lista_num(lista_numere);
        int suma = calculeazasuma(lista_numere);
        System.out.println("Suma elementelor din lista este: " + suma);
    }
}
