import java.util.Scanner;

public class Maincifre {
    public static void main(String[] args) {
        afiseazaPeRand(1, 3); // Afișează 1 de trei ori pe un rând
        afiseazaPeRand(2, 2); // Afișează 2 de două ori pe un rând
        afiseazaPeRand(3, 1); // Afișează 3 o singură dată pe un rând

        AfisareCifre();
    }

    // Metodă pentru a afișa un număr specificat de cifre pe un rând
    public static void afiseazaPeRand(int cifra, int numarDeAparitii) {
        for (int i = 0; i < numarDeAparitii; i++) {
            System.out.print(cifra + " ");
        }
        System.out.println(); // Trecem la un rând nou după fiecare secvență
    }

    public static void AfisareCifre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar de la 1 la 7 ca numar de linii");
        int numar = scanner.nextInt();

        int cifra = 1;
        for ( int j=0; j< numar+cifra; j++) {
            for (int i = 0; i < numar; i++) {
                System.out.print(cifra + " ");
            }
            numar = numar-1;
            System.out.println();
            cifra ++;

        }
        }
    }

