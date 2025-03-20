import java.util.Scanner;

public class Tema2_pct11 {
    public static void main(String[] args) {
        //11. Se cere să se scrie un program Java care să calculeze şi să afişeze perimetru şi aria
        //unui dreptunghi. Valorile pentru lungime şi lățime se citesc de la tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un lungimea dreptunghiului:");
        int lung = scanner.nextInt();
        System.out.println("Introduceti un latimea dreptunghiului:");
        int lat = scanner.nextInt();

        int perimetru=0;
        int aria = 0;
        perimetru = (2*lung)+(2*lat);
        aria = lung* lat;
        System.out.println("Perimetrul dreptunghiului este :" + perimetru);
        System.out.println("Aria dreptunghiului este :" + aria);

    }
}