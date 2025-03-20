public class Tema2_pct8 {public static void main(String[] args) {
//8. Numarati, printr-un for, cate numere impare se regasesc in intervalul 34 si 57 si
//afiasti rezultatul pe ecran.
    int nb_impare = 0;
    for( int j= 34; j<=57; j++)
    {
        if (j%2 == 0)
            System.out.println("Numarul"+j +" este par:");
        else {
            System.out.println("Numarul " + j + "este impar:");
            nb_impare = nb_impare +1;
        }
        System.out.println("In interval sunt "+nb_impare+ " numere impare");
    }

}
}
