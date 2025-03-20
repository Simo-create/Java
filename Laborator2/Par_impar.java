import java.util.Scanner;

public class Par_impar {public static void main(String[] args) {
    //11. Par sau impar?
    // Cerință: Scrieți un program care să ceară utilizatorului să introducă un număr și să
    //afișeze dacă acesta este par sau impar. Apoi, întrebați dacă dorește să mai
    //introducă un număr (y/n).
    // Hint: Folosiți operatorul % pentru a verifica paritatea. Folosiți un while pentru a
    //repeta jocul atâta timp cât utilizatorul alege y.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduceti literele Y sau N de la tastatura:");
    char c = scanner.next().charAt(0);
    while (c == 'Y') {
        System.out.println("Introduceti un numar de la tastatura:");
        int n = scanner.nextInt();
        if (n % 2 == 0)
            System.out.println("Numarul introdus este par");
        else
            System.out.println("Numarul introdus este impar");
        System.out.println("Mai continuati cu numerele?");
        char d = scanner.next().charAt(0);
        if (d == 'N') {
            System.out.println("Programul se termina");
            break;
        }
        }
}
}
