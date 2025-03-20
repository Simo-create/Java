public class Lab3_teme2 {

    public static void afisareElemente(int[] array)
    {
        for (int i=0;i<array.length; i++){
            System.out.println("Elementul tabloului de indexul " + i + " este: " + array[i]);
        }
    }

    public static void main(String[] args) {
        int[] valori={1,1,2,4,99,6,7};
       //apelare metoda de afisare elemente din tablou
        afisareElemente(valori);

    }
}

