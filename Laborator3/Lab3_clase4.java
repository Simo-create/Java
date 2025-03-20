import java.util.Scanner;

public class Lab3_clase4 {
    public static void afisare_tablou(int [] array)
    {
        System.out.println("Numerele din tabloul din input sunt urmatoarele : ");
        for (int i=0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void afisare_numere_pare(int [] array)
    {
        System.out.println("Numerele pare din tabloul din input sunt urmatoarele : ");
        for (int i=0; i <array.length; i++)
        {
            if(array[i]%2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numere = {1,2,3,4,5,6,7,8,9,10};
        //apelare metoda pentru afisarea numerelor din tablou
        afisare_tablou(numere);
        //apelare metoda pentru afisarea numerelor pare din tablou
        afisare_numere_pare(numere);

    }

}
