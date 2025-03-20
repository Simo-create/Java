import java.util.ArrayList;
import java.util.List;

public class ElementeComune {
// Construiti o metoda care primeste ca parametru doua tablouri si returneaza un nou
//tablou cu elementele comune din el.
    void elementeComune(int[] array1, int[] array2) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int elem1 : array1) {
            for (int elem2 : array2) {
                if (elem1 == elem2) {
                    lista.add(elem1);
                    break;
                }
            }
        }
        Integer[] array = lista.toArray(new Integer[0]);
        for (int elem : array) {
            System.out.println(elem + " ");
        }
    }

}

