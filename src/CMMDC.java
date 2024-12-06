import java.util.Scanner;

public class CMMDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar a de la tastatura");
        int a = scanner.nextInt();
        System.out.println("Introduceti un numar b de la tastatura");
        int b = scanner.nextInt();

        if (a <= 30 && b <= 30) {
            System.out.println("Calculam CMMDC al celor 2 numere : ");
            while (a > b) {
                a = a - b;
                System.out.println("Scadem");
            }
        System.out.println("val lui a este" + a);
        System.out.println("val lui b este" + b);
        while (b > a) {
            b = b - a;
            System.out.println("Scadem");
        }
        if (b == a)
            System.out.println("CMMDC al numerelor este " + b);
        else
            System.out.println("Numere prime");
    }
}
}
