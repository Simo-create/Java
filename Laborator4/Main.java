import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ElementeComune elementeComune = new ElementeComune();
        Carte carte1 = new Carte("Mandrie si glorie", 298);
        Carte carte2 = new Carte("Pulbere de Stele ", 90);
        Carte carte3 = new Carte("Carte3 ", 100);
        Carte carte4 = new Carte("Carte4 ", 190);
        Autor autorCarte1 = new Autor("Autor1", "Carte1", 125);
        Autor autorCarte2 = new Autor("Autor2", "Carte2", 321);

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 5, 4, 8, 1};

// Construiti o metoda care primeste ca parametru doua tablouri si returneaza un nou
//tablou cu elementele comune din el.
        elementeComune.elementeComune(array1,array2);

//Construiți o metodă care returnează cartea cu cele mai multe pagini.
//o Scrieți o metodă care primește două obiecte de tip Carte și returnează cartea
//cu numărul cel mai mare de pagini.
//o Hint: ne folosim de opratorul >

        Carte.carteaCuMaiMultePagini(carte1, carte2);
        Carte.carteaCuMaiMultePagini(carte3, carte4);

//Creați o metodă care verifică dacă două cărți au același autor.
//o Scrieți o metodă care primește două obiecte Carte și verifică dacă acestea au
//același autor
//o Hint: ne putem folosi de metoda eguals() din clasa Object
//Carte carte1 = new Carte(“Titlu1”, “autor1”, numarPagini1);
//Carte carte2 = new Carte(“Titlu2”, “autor2”, numarPagini2);
//boolean var = cart1.autor.eguals(carte2.autor);
//Incadrati intr-o metoda si returnati rezultatul boolean


        Autor.carteaCuAcelasiAutor(autorCarte1,autorCarte2);
         }
    }
