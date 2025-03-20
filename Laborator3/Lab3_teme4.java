public class Lab3_teme4 {

    public static int sumaElementeTablou(int[] tablou)
    {
        int suma = 0;
        for (int i=0;i<tablou.length; i++){
            suma = suma + tablou[i];
        }
        return suma;
    }

    public static void main(String[] args) {

        int[] rezultat= {1,2,3,4,8,11,22,10};
        //apelare metoda pentru calcul suma elemente din tablou
        int suma = sumaElementeTablou(rezultat);
        System.out.println("Suma elementelor din tablou este " + suma);
    }
}

