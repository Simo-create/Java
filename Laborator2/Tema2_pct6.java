public class Tema2_pct6 {
    public static void main(String[] args) {

    //  6. Calculati suma numerelor pare cu while, do-while si for (in intervalul 5-20)
    int suma = 0;
    int nb = 5;
        while  ( nb <= 20 )
        {
            if(nb%2 == 0)
                suma = suma +nb;
            nb = nb+1;
        }
        System.out.println("Suma numerelor este:"+ suma);

        int suma1 = 0;
        int nb1 = 5;
        do
        {
            if(nb1%2 == 0)
                suma1 = suma1 +nb1;
            nb1 = nb1+1;
        }while(nb1 <=20);
        System.out.println("Suma numerelor este:"+ suma1);

        int suma2 = 0;
        for(int i=5; i<=20; i++ )
        {
            if(i%2 == 0)
                suma2 = suma2 +i;
        }
        System.out.println("Suma numerelor este:" + suma2);
    }
}
