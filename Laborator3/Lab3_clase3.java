import java.util.Scanner;

public class Lab3_clase3 {
    public static int max_2_numere(int X, int Y)
    {
        int rez_max = X>Y?X:Y;
        return rez_max;
    }
    public static int min_2_numere(int X, int Y)
    {
        int rez_min = X<Y?X:Y;
        return rez_min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar X:");
        int X = scanner.nextInt();
        System.out.println("Introduceti un numar Y:");
        int Y = scanner.nextInt();
        //apelare metoda cu numere introduse de la tastatura
        int val_max = max_2_numere(X,Y);
        System.out.println("Maximul numerelor este: "+ val_max);
        int val_min = min_2_numere(X, Y);
        System.out.println("Minimul numerelor este: "+ val_min);
        //apelare metoda cu numere introduse din cod
        int val2 = max_2_numere(5,15);
        System.out.println("Maximul numerelor 5 si 15 este: "+ val2);
        //apelare metoda cu numere introduse din cod
        int val3 = max_2_numere(10,2);
        System.out.println("Maximul numerelor 10 si 2 este: "+ val3);
    }

}
