import java.util.Scanner;

public class MainProblema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar de la 1 la 7");
        int numar = scanner.nextInt();

        for (int i=0; i < numar; i++)
        {
            System.out.print("1");
            if(i <  numar -1)
            {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        int numar1 = numar -1;

        for (int i=0; i < numar1; i++)
        {
            System.out.print("2");
            if(i <  numar1 -1)
            {
                System.out.print(" ");
            }
        }
    }
}
