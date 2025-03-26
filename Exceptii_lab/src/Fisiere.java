import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Fisiere {
    public static void citireFisier(){
        File fisier = new File("src/cantec_in.txt");
        try (Scanner scanner = new Scanner(fisier)){
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();// Citește o linie completa
                System.out.println(linie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fișierul nu a fost găsit: " +
                    e.getMessage());
        }
    }

    public static void trateazaExceptii(String[] tablou) throws IOException,FileNotFoundException{
        for(String string: tablou){
            if(string.contains("@")){
                throw new IOException("Caracter special");
            }
            if(string.length()==0){
                throw new IOException("Lungime 0");
            }
            if(string.startsWith("mmm")){
                throw new FileNotFoundException();
            }
            System.out.println("Citire sir");
        }
    }
}
