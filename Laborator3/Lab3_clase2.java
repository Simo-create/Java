import java.util.Scanner;

public class Lab3_clase2 {
    public static int calculFunctie(int X)
    {
        //metoda primeste un numar intreg si returneaza valoarea functiei
     //   int rez = 0;
        int rez = 3*X + 5;
        System.out.println("Rezultatul pentru X = "+X+ " este :"+ rez);
        return rez;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar X:");
        int X = scanner.nextInt();
        calculFunctie(X);
        System.out.println("Apelam metoda pentru X = 5");
        calculFunctie(5);
        System.out.println("Apelam metoda pentru X = 10");
        calculFunctie(10);
    }

}
