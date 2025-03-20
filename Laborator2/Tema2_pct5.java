import java.util.Scanner;

public class Tema2_pct5 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //5. Realizati factorialul primelor 10 numere (1*2*3*...*10) si afisati pe ecran, cu while, dowhile si for;
    int num = 10, i = 1;
    long factorial = 1;
    while(i <= num)
    {
        factorial *= i;
        i++;
    }
    System.out.printf("Factorialul celor %d numere este = %d", num, factorial);

    int fact1 = 1;
    int k = 1;

    do {
        fact1 *= k;
        k++;
    } while ( k <= 10);

    System.out.println("Factorialul a 10 numere este " + fact1);

    int nb = 10;
    long fact = 1;
    for(int j = 1; j <= nb; j++)
    {
        fact = fact * j;
    }
    System.out.println("Factorialul celor "+nb+" numere este: "+fact);
}
}
