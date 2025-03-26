import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class CitireFisier {
    public CitireFisier() throws IOException {
    }

    public static void main(String[] args) {

        File fisier = new File("src/carti.txt");

        int nrliniifisier = 0;
        try (Scanner scanner = new Scanner(fisier)){
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();// Citește o linie completa
                nrliniifisier += 1;
                System.out.println(linie);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit: " +
                    e.getMessage());
        }
        System.out.println("Fisierul are un numar de "+nrliniifisier+" linii");
    }
}
