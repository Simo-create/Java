import java.util.Scanner;

public class Tema2_pct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   //     3. Afisati, pe ecran, numerele impare (1, 3, 5, ...) de la 1 la 31, cu while, do-while si for;
        System.out.println("Se vor afisa pe ecran numerele impare de la 1 la 31");
        int n=1;
        while  ( n<=31 )
        {
            System.out.println("Valoarea curenta a lui n este:"+n);
            n=n+2;
        }
        int n1=1;
        do{
            System.out.println("Valoarea curenta a lui n1 este:"+n1);
            n1=n1+2;
        }while(n1<=31);
        //
        for(int i=1; i<=31; i++ )
        {
            System.out.println("Valoarea curenta a numarului este:"+i);
            i++;
        }
    }
}
