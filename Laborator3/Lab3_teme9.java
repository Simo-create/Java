import java.util.List;
import java.util.Arrays;
//Un ciclu for-each parcurge direct elementele unei colecții (în cazul nostru, o listă), fără a fi nevoie să folosim un index explicit.
public class Lab3_teme9 {

    public static void elementeLista(List<Integer> lista)
    {
        for (Integer nr_elem : lista){
            System.out.println("Element din lista:"+ nr_elem);

        }
    }

    public static void main(String[] args) {

        List<Integer> numere = Arrays.asList(1,2,3,4,5,6);

        elementeLista(numere);
    }
}
