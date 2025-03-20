public class Lab3_teme6 {

    public static int numaraInInterval(int[] tablou)
    {
        int nr_elem = 0;
        for (int i=0;i<tablou.length; i++){
            if(tablou[i]> 0 && tablou[i] <101) {
                nr_elem = nr_elem + 1;
            }
        }
        return nr_elem;
    }

    public static void main(String[] args) {

        int[] tablou= {1,2,3,4,8,11,22,33,102,100,99};
        //apelare metoda numarare elemente in interval
        int elemente_in_interval = numaraInInterval(tablou);
        System.out.println("Numarul elementelor in interval din tablou este " + elemente_in_interval);
    }
}

