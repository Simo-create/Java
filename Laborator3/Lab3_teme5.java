public class Lab3_teme5 {

    public static int numaraElementePare(int[] tablou)
    {
        int nr_elem_pare = 0;
        for (int i=0;i<tablou.length; i++){
            if(tablou[i]%2 == 0) {
                nr_elem_pare = nr_elem_pare + 1;
            }
        }
        return nr_elem_pare;
    }

    public static void main(String[] args) {

        int[] tablou= {1,2,3,4,8,11,22,33,10};
        //apelare metoda de numarare elemente pare din tablou
        int nr_elemente_pare = numaraElementePare(tablou);
        System.out.println("Numarul elementelor pare din tablou este: " + nr_elemente_pare);
    }
}

