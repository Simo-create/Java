import java.util.Scanner;

public class Tema2_pct10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura:");
        int x = scanner.nextInt();
        while (x <= 7) {
            if (1 < x)
                if (x < 6) {
                    System.out.println("Este o zi de lucru din saptamana");
                } else
                    System.out.println("Este o zi de weekend");
            System.out.println("Introduceti un numar de la tastatura:");
            x = scanner.nextInt();

        }
     }
}

