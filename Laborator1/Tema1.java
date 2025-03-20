import java.util.Scanner;

public class Tema1 {
    public static void main(String argv[]) {

        //2. Afisati mesajul "Incep tema";
        System.out.println("Incep tema");

        //3. Afisati mesajul "Incep tema" prin salvarea acestui String intr-o variabila;
        String sir = "Incep tema";
        Scanner scanner = new Scanner(System.in);
        System.out.println(sir);

        //4. Declarati doua variabile: x si y, de tip intreg, apoi stocati rezultatul intr-o variabila
        //"suma". Afisati rezultatul pe ecran.
        int x = 2, y = 3;
        int suma = x + y;

        //5. Folosind aceeasi variabila, afisati mesajul "Suma este: ", urmat de rezultatul sumei.
        System.out.println("Suma este " + suma);

        //6. Scrieți un program care să citească două numere întregi de la tastatură și să
        //determine minimul dintre ele.

        System.out.println("Introduceti un numar intreg");
        int a1 = scanner.nextInt();

        System.out.println("Ati introdus numarul" + a1);

        System.out.println("Introduceti un numar intreg");
        int b1 = scanner.nextInt();

        System.out.println("Ati introdus numarul" + b1);
        int suma_nb = a1+b1;
        System.out.println("Suma numerelor este  " + suma_nb);
        if (a1 < b1)
        {
            System.out.println("Cel mai mic numar dintre cele 2 este " + a1);
        }
        else
        {
            System.out.println("Cel mai mic numar dintre cele 2 este " + b1);
        }

        //7. Realizati impartirea a doua numere de tipul double si afisati rezultatul pe ecran.
        System.out.print("Introduceti un numar double: ");
        double value1 = scanner.nextDouble();
        System.out.print("Introduceti un alt numar double: ");
        double value2 = scanner.nextDouble();
        double rez = value1/value2;
        System.out.print("Rezultatul impartirii numerelor este: " + rez);

        //8. Construiti un caz in care sa afisati trei mesaje pe ecran, prin utilizarea: if-else if-else
        if(a1 < b1)
        {
            System.out.print("A1 < B1");
        }
        else
            if (a1 == b1)
            {
                System.out.print("Numere egale");
            }
            else
            {
                System.out.print("B1 < A1");
            }
    }
}
