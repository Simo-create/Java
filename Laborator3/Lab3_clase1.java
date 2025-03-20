import java.util.Scanner;

public class Lab3_clase1 {

    public static void afiseazaMesaj(String mesaj)
    {
        System.out.println(mesaj);
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduceti un mesaj:");
    String mesaj = scanner.nextLine();
    afiseazaMesaj(mesaj);
//a doua apelare a metodei cu mesaj dat direct din cod.
    afiseazaMesaj("A doua apelare a metodei. Va afisa acest mesaj dat direct din cod. ");
    }
}

