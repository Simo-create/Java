public class MainPassByValue {
    public static void main(String[] args) {

        int numar;
        double valoare;

        PassByValue transferprinvaloare = new PassByValue(2,5);
        System.out.println("Afisare numar si valoare inainte de apel metoda");
        System.out.println("Numarul este "+ transferprinvaloare.getNumar()
                + "si valoarea este "+ transferprinvaloare.getValoare());

        System.out.println(transferprinvaloare.getNumar());
//apel inainte de metoda
        System.out.println("Numarul este "+ transferprinvaloare.getNumar());
        System.out.println("Valoarea este "+ transferprinvaloare.getValoare());

//apel metoda cu schimbare valori
        transferprinvaloare.afisarenumar();

//apel inainte de metoda

        System.out.println("Numarul este "+ transferprinvaloare.getNumar());
        System.out.println("Valoarea este "+ transferprinvaloare.getValoare());
    }
}