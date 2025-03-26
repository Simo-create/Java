import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException ,ExceptiePerso, IOException , Exc1,Exc2 {
        try {
            Calculator.Operatii.impartire(10, 0);
        } catch (ImpartireLaZeroImposibila e) {
            System.out.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int nr = scanner.nextInt();
        try {
            Calculator.Operatii.scadere(2, 7);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        int numar = 7;
        Caine.modifica(numar);
        System.out.println("valoarea in main este: "+numar);

        Animal animal = new Caine();
        Animal animal1 = new Pisica();

        animal1.sunet();
        animal.sunet();

        Fisiere.citireFisier();

        String[] sir = {"aaa", " ", "11qw"};
        try {
            Fisiere.trateazaExceptii(sir);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("introduceti un numar bun");
        int n = scanner1.nextInt();
        if(n > 5) {
            throw new ExceptiePerso("Eroare");
        }
        else{
            System.out.println("Numar bun");
        }

        A.doSometh(10);
        Exercitiu.doSomething(5);

        int numar1 = 7;
        Caine.modifica(numar1);
        System.out.println("valoarea in main este: "+numar1);





    }

}