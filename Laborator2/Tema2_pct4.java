import java.util.Scanner;

public class Tema2_pct4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //4. Realizati suma primelor 10 numere si afisati-o pe ecran, cu while, do-while si for;
        int suma_while = 0;
        int nb = 1;
        while  ( nb <= 10 )
        {
            suma_while = suma_while+nb;
            nb = nb+1;
        }
        System.out.println("Suma numerelor este:"+ suma_while);

        int nb_do = 1;
        int suma_do = 0;
        do{
            suma_do = suma_do+nb_do;
            nb_do = nb_do+1;

        }while(nb_do <= 10 );
        System.out.println("Suma numerelor este" + suma_do);


        int suma = 0;
        for(int i=1; i<=10; i++ )
        {
             suma = suma +i;
        }
        System.out.println(" Suma numerelor este: " + suma);
    }
}
