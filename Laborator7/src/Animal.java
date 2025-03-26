public class Animal {
    String nume;

    public Animal(String nume){
        this.nume = nume;
    }

    public static void modificaNume(Animal animal){
        animal.nume = "Cal";
    }

    public void actiuneanimal(Animal animal){

        System.out.println("Animalul " + animal.nume + " se misca");
    }
}
