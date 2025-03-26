import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Echipament> echipamente = new ArrayList<>();
        List<Echipament> echipamenteFiltrate = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        Echipament ec = new Imprimante(" Imprimanta ", "112244",1000, "fata",
                " vandut",11,22,123,"color");


        echipamente.add(ec);
        echipamente.add(new Imprimante(" Imprimanta ", "112244",1000, "fata",
                " vandut",11,22,123,"color"));
        echipamente.add(new Imprimante(" Imprimanta ", "112244",1000, "fata",
                " vandut",11,22,123,"albnegru"));
        echipamente.add(new Copiatoare("XEROX","14785",500, "lateral",
                "expus", 66,"A4"));
        echipamente.add(new Copiatoare("XEROX","14786",600, "lateral",
                "expus", 66,"A4"));
        echipamente.add(new Copiatoare("XEROX","14785",700, "lateral",
                "expus", 66,"A4"));
        echipamente.add(new Copiatoare("XEROX","14785",500, "lateral",
                "expus", 66,"A4"));
        echipamente.add(new SistemeDeCalcul("Sistem Windows", "221133", 2300, "fata", "achizitionat",
                "AABBCC", 12345, 221155, "Windows"));
        echipamente.add(new SistemeDeCalcul("Sistem Windows", "221133", 2300, "fata", "achizitionat",
                "AABBCC", 12345, 221155, "Windows"));
        echipamente.add(new SistemeDeCalcul("Sistem Windows", "221133", 2300, "fata", "achizitionat",
                "AABBCC", 12345, 221155, "Windows"));

        String stareadorita = " vandut";

        boolean running = true;
        while (running) {
            System.out.println("\n===== Meniu Principal =====");
            System.out.println("1. Afișare toate echipamentele");
            System.out.println("2. Afișare imprimante");
            System.out.println("3. Afișare copiatoare");
            System.out.println("4. Afișare sisteme de calcul");
            System.out.println("5. Modificare stare echipament");
            System.out.println("6. Setare mod de tipărire pentru imprimantă");
            System.out.println("7. Setare format copiere pentru copiator");
            System.out.println("8. Instalare sistem de operare pe sistem de calcul");
            System.out.println("9. Afișare echipamente vândute");
            System.out.println("0. Ieșire");
            System.out.println("Alege o opțiune: ");
            int optiune = scanner.nextInt();
            scanner.nextLine(); // Consumă newline
            switch (optiune) {
                case 1:
// Logica pentru afișarea tuturor echipamentelor
                    System.out.println("Afișare toate echipamentele din firma");
                    running = false;
                    for(Echipament echipament: echipamente){
                       System.out.println(echipament);
                    }
                    break;
                case 2:
// Logica pentru afișarea imprimantelor
                    System.out.println("Afișare imprimante din lista de echipamente");
                    running = false;
                    for(Echipament echipament: echipamente) {
                        if (echipament instanceof Imprimante) {
                            System.out.println(echipament);
                        }
                    }
                    break;
                case 3:
// Logica pentru afișarea copiatoare
                    System.out.println("Afișare copiatoare din lista de echipamente");
                    running = false;
                    for(Echipament echipament: echipamente){
                        if (echipament instanceof Copiatoare){
                            System.out.println(echipament);
                        }
                    }
                    break;
                case 4:
// Logica pentru afișarea sisteme de calcul
                System.out.println("Afișare sisteme de calcul din lista de echipamente");
                running = false;
                    for(Echipament echipament: echipamente){
                        if (echipament instanceof SistemeDeCalcul){
                            System.out.println(echipament);
                        }
                    }
                break;
                case 5:
// Logica pentru modificare stare echipament
                System.out.println("Modificare stare echipament");
                running = false;
                break;
                case 6:
// Logica pentru setare mod tiparire pentru imprimanta
                System.out.println("Setare mod de tipărire pentru imprimantă");
                running = false;
                for(Echipament echipament: echipamente){
                    if (echipament instanceof Imprimante){
                        Imprimante imprimante = (Imprimante) echipament;
                        imprimante.setMod_tiparire("color");
                        System.out.println("Setare mod tiparire color");
                        System.out.println(imprimante.toString());
                    }
                }
                break;
                case 7:
// Logica pentru setare format copiere pentru copiator
                System.out.println("Setare format copiere pentru copiator");
                running = false;
                    for(Echipament echipament: echipamente){
                        if (echipament instanceof Copiatoare){
                            Copiatoare copiatoare = (Copiatoare) echipament;
                            copiatoare.setFormat("A4");
                            System.out.println("Setare format de tiparire A4");
                            System.out.println(copiatoare);
                        }
                    }
                break;
                case 8:
// Logica pentru instalarea sistem de operare
                System.out.println("Instalare sistem de operare Windows pe sistemele de calcul");
                running = false;
                    for(Echipament echipament: echipamente){
                        if (echipament instanceof SistemeDeCalcul){
                            SistemeDeCalcul sistemeDeCalcul = (SistemeDeCalcul) echipament;
                            sistemeDeCalcul.setSistoperare("Windows");
                            System.out.println("Instalare sistem de operare Windows.");
                            System.out.println(sistemeDeCalcul.toString());
                        }
                    }
                break;
                case 9:
// Logica pentru afișarea echipamente vandute
                System.out.println("Afișare echipamente vândute");
                running = false;
                    for (Echipament echipament : echipamente) {
                        if (echipament.getStare().equals(stareadorita)) {
                            echipamenteFiltrate.add(echipament);
                        }
                    }
                    for (Echipament echipament : echipamenteFiltrate){
                        System.out.println(echipament);
                    }
                break;
                case 0:
// Logica pentru iesire
                System.out.println("Ai ales sa parasesti programul. ");
                running = false;
                break;
                default:
// Logica pentru iesire optiune invalida
                System.out.println("Ieșire. Optiunea aleasa nu exista. Incearca din nou.");
                running = false;
            }
        }
    scanner.close();
    }

}