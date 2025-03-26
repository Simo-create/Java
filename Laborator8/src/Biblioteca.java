import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<MaterialDeBiblioteca> materiale = new ArrayList<>();

    public void adaugaMaterial(MaterialDeBiblioteca element) {
        materiale.add(element);
    }

    public void afiseazaMaterialeDinBiblioteca() {
        for (MaterialDeBiblioteca element : materiale) {
            element.descriereMaterial();
        }
    }


    public void cautareDupaTitlu(String titlu) {
        for (MaterialDeBiblioteca element : materiale) {
            if (element.getTitlu().equalsIgnoreCase(titlu)) {
                System.out.println("Materialul are urmatoarele detalii");
                element.descriereMaterial();
            } else {
                System.out.println("Materialul nu a fost gasit.");
            }
        }
    }

    public void imprumutaDacaEPosibil(String titlu) {
        for (MaterialDeBiblioteca element : materiale) {
            if (element.getTitlu().equalsIgnoreCase(titlu)) {
                if (element.getDisponibilitate()) {
                    System.out.println("Materialul cu titlul " + titlu + " se poate imprumuta");
                    break;
                } else {
                    System.out.println("Materialul cu titlul " + titlu + " nu poate fi imprumutat.");
                    break;
                }
            }

        }
    }
}


