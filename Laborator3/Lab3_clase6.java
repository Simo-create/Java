import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3_clase6 {
    public static String zileleSaptamanii(int numar)
    {
        String ziua;
        switch (numar) {
            case 1:
                ziua = "Luni";
                break;
            case 2:
                ziua = "Marți";
                break;
            case 3:
                ziua = "Miercuri";
                break;
            case 4:
                ziua = "Joi";
                break;
            case 5:
                ziua = "Vineri";
                break;
            case 6:
                ziua = "Sâmbătă";
                break;
            case 7:
                ziua = "Duminică";
                break;
            default:
                ziua = "Număr invalid. Trebuie introdus un număr între 1 și 7.";
                break;
        }
        return ziua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String raspuns;
        //int X = scanner.nextInt();
        do {
            // Solicităm utilizatorului să introducă un număr
            System.out.print("Introdu un număr: ");
            int X = scanner.nextInt();
            System.out.println("Ai introdus numărul: " + X);
            System.out.println("Ziua este: " + zileleSaptamanii(X));

            // Întrebăm utilizatorul dacă vrea să continue
            System.out.print("Vrei să introduci un alt număr? (da/nu): ");
            raspuns = scanner.next(); // Citim răspunsul utilizatorului
        } while (raspuns.equalsIgnoreCase("da")); // Continuăm cât timp răspunsul este "da"
        System.out.println("Programul s-a terminat. ");
        }
}

