public class Lab3_teme3 {

    public static int[] afisareTablou(int nr_elem, int valoare)
    {
        int[] tab = new int[nr_elem];
        for (int i=0;i<tab.length; i++){
            System.out.println("Elementul tabloului de indexul " + i + " este: " + tab[i]);
            tab[i] = valoare;
        }
        return tab;
    }

    public static void main(String[] args) {
//apelare metoda cu valori fixe pentru elementele din tablou
        int[] rezultat=afisareTablou(5,12);
        for(int i=0; i< rezultat.length; i++)
        {
            System.out.println("Elementul tabloului de indexul " + i + " este "+ rezultat[i]);
        }

    }
}

