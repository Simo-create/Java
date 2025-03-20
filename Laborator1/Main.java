import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 2;
        int b = 5;
        int c=0, d=1, e=2;
        String str = "Acesta este un sir de caractere";
        System.out.println(str);
        int suma = a+b;
        System.out.println("suma numerelor a+b este: "+ suma);
        int diferenta = b-a ;
        System.out.println("diferenta numerelor b-a este: "+ diferenta);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg");
        System.out.println("a= ");
        int a1 = scanner.nextInt();
        System.out.println("Ati introdus numarul" +a1);

        System.out.print("Enter a value double: ");
        double value = scanner.nextDouble();

        System.out.println("Introduceți un număr de tip long: ");
        long nb = scanner.nextLong();
        System.out.println("Ați introdus numărul: " + nb);

        // Afișăm un mesaj pentru utilizator
        System.out.println("Introduceți un string: ");

        // Citim string-ul introdus de utilizator
        String input = scanner.nextLine();

        // Afișăm string-ul citit
        System.out.println("Ați introdus: " + input);

        // Închidem scanner-ul
        //scanner.close();
    }
}