import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Afisati, pe ecran, numerele de la 10 la 1, cu while, do-while si for;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Se vor afisa pe ecran numerele de la 10 la 1");
        int n=10;
        while  ( n>0 )
        {
            System.out.println("Valoarea curenta a lui n este:"+n);
            n--;
        }
        int n1=10;
        do{
            System.out.println("Valoarea curenta a lui n1 este:"+n1);
            n1--;
        }while(n1>0);

        //int n2 = 10;
        for(int i=10; i>0; i-- )
        {
            System.out.println("Valoarea curenta a lui n2 este:"+i);
        }
//2. Afisati, pe ecran, de 7 ori, textul "Invat programare", cu while, do-while si for;
        int n2= 7;
        System.out.println("Invat programare With while loop");
        while  ( n2>0 )
        {
            System.out.println("Invat programare");
            n2--;
        }
        int n3=7;
        System.out.println("Invat programare With do while loop");
        do{
            System.out.println("Invat programare");
            n3--;
        }while(n3>0);

        //int n2 = 10;
        System.out.println("Invat programare With FOR loop");
        for(int i=0; i<7; i++ )
        {
            System.out.println("Invat programare");
        }
    }
}