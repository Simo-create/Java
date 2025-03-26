public class MainTest {
    public static void main(String[] args) {

        Animal animal = new Animal("Pisica");
        Forma forma = new Forma(2,3,4,5, 5);
        Student student = new Student("Marcel", 8, "3");

        forma.ariatriunghi(3,5);
        forma.ariacerc(5);
        forma.ariadreptunghi(2,9);

        animal.actiuneanimal(animal);

        System.out.println(student.toString());



    }
}
