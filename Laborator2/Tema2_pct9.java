public class Tema2_pct9 {public static void main(String[] args) {
    //9. Numarati cate numere divizibile cu 3 exista in intervalul 5-25. Un numar este divizibil
    //cu 3 daca restul impartirii la 3 este egal cu 0 (numar % 3 == 0)
    int nb_div_3 = 0;
    for( int j= 5; j<=25; j++)
    {
        if (j%3 == 0) {
            System.out.println("Numarul" + j + " este divizibil cu 3:");
            nb_div_3 = nb_div_3 + 1;
        }
        else {
            System.out.println("Numarul " + j + "nu este divizibil cu 3:");
        }
    }
    System.out.println("In interval sunt "+nb_div_3 + " numere divizibile cu 3");
}
}
