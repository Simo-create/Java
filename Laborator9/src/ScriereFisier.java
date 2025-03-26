import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriereFisier {
    public static void main(String[] args) throws IOException {

    try (BufferedWriter bw = new BufferedWriter(new
            FileWriter("src/carti.txt"))) {
        bw.write("Aceasta este o lini1 în fișier.");
        bw.newLine();
        bw.write("Aceasta este o linia a 2-a în fișier.");
        bw.newLine();
        bw.write("Scrierea este completă!");
        System.out.println("Fisierul a fost scris cu success");
    } catch (IOException e) {
        System.out.println("Eroare la scrierea în fișier: " +
                e.getMessage());
    }




}
}
