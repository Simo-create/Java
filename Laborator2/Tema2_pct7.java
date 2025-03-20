public class Tema2_pct7 {
    public static void main(String[] args) {
   //7. Parcurgeti cu for, while, do-while numerele de la 1 la 20, iar pentru fiecare numar
        //par, afisati un mesaj pe ecran, iar pentru un numar impar, alt mesaj.
        int nb = 1;
        for( int i= 1; i<=20; i++)
        {
            if (i%2 == 0)
                System.out.println("Numarul"+i +" este par:");
            else
                System.out.println("Numarul "+i +"este impar:");
        }
        while  ( nb <= 20 )
        {
            if(nb%2 == 0)
                System.out.println("Numarul"+nb +" este par:");
            else
                System.out.println("Numarul"+nb +" este impar:");
            nb = nb+1;
        }
        int nb1 = 1;
        do
        {
            if(nb1%2 == 0)
                System.out.println("Numarul"+nb1 +" este par:");
            else
                System.out.println("Numarul"+nb1 +" este impar:");
            nb1 = nb1+1;
        }while(nb1 <=20);
    }
}
