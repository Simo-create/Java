public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Pisica");
        System.out.println("Nume inainte de apel metoda "+ animal.nume);

        //schimbam numele

        animal.modificaNume(animal);
        System.out.println("Nume dupa apel metoda "+ animal.nume);
        Animal animal1 = new Animal("Maimuta");
        System.out.println("Nume inainte de apel metoda "+ animal1.nume);
    }

}
