public class Lab3_teme8 {

    public static int medieTablou(int[] tablou)
    {
        int medie=0;
        int nr_elem=0;
        int suma = 0;
        for (int i=0;i<tablou.length; i++){
            nr_elem += 1;
            suma += tablou[i];
        }
        medie = suma/nr_elem;
        return medie;
    }

    public static void main(String[] args) {

        int[] tablou= {1,2,3,4,8,11,22,33,102,100,99};
        //apelare metoda care va returna media elementelor dintr-un tablou
        int media = medieTablou(tablou);

        System.out.println("Media elementelor din tablou este: " + media);
    }
}
