public class Lab3_teme7 {

    public static int[] inversareTablou(int[] tablou)
    {
        int[] tablouinversat = new int[tablou.length];
        for (int i=0;i<tablou.length; i++){
            tablouinversat[i] = tablou[tablou.length - 1 - i];
        }
        return tablouinversat;
    }

    public static void main(String[] args) {

        int[] tablou= {1,2,3,4,8,11,22,33,102,100,99};
        int[] tablouinversat = inversareTablou(tablou);

        for(int i=0;i<tablouinversat.length; i++)
        {
        System.out.println("Elementul din tabloul inversat sunt : " + tablouinversat[i]);
    }
        for(int i=0;i<tablou.length; i++)
        {
            System.out.println("Elementul din tabloul initial sunt : " + tablou[i]);

        }
    }
}

