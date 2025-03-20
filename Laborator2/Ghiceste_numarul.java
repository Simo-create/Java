import java.util.Random;
import java.util.Scanner;

public class Ghiceste_numarul {
    public static void main(String[] args) {
        // Cerință: Scrieți un program care să genereze un număr aleatoriu între 1 și 100, iar
        //utilizatorul trebuie să ghicească acest număr. Programul va indica dacă numărul
        //ghicit este mai mare sau mai mic decât cel ales de calculator.
        // Folosiți Math.random() pentru a genera numărul aleatoriu și Scanner pentru a prelua
        //încercările utilizatorului.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti Y daca vreti sa ghiciti numarul dat de calculator: ");
        char c = scanner.next().charAt(0);
        while (c == 'Y') {
            System.out.println("Introduceti un numar de la tastatura:");
            int x = scanner.nextInt();
            Random random = new Random();
            int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
            System.out.println("Random Number: " + randomNumber);

            if (x == randomNumber)
                System.out.println("Ati ghicit numarul dat de calculator");
            else {
                System.out.println("Mai incercati sa ghiciti numarul?");
                System.out.println("Introduceti literele Y sau N de la tastatura:");
                char d = scanner.next().charAt(0);
                if (d == 'N') {
                    System.out.println("Programul se termina");
                    break;
                }
            }


        }
    }
}
