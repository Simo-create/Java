import com.exemplu.utilitati.Utilitati;
import com.exemplu.vizibilitate.Persoana;

public class MainPachete {
    public static void main(String[] args) {

        Persoana persoana = new Persoana("Ion", "Gica", 35, "123456");

        Utilitati utilitati = new Utilitati("eon", "curenta", persoana);

        persoana.detaliiVizibilitate();
        utilitati.utilitati();


    }
}
