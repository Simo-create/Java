import java.util.Scanner;

public class String_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Afișăm un mesaj pentru utilizator
        System.out.println("Introduceți un string: ");

        // Citim string-ul introdus de utilizator
        String input = scanner.nextLine();

        // Afișăm string-ul citit
        System.out.println("Ați introdus: " + input);

        // Închidem scanner-ul
        scanner.close();
    }
}
