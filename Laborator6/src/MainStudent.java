public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student("Popescu", "Ion", 1234);
        Student student2 = new Student("Marin", "Viorel", 4321);
        Student student3 = new Student("Marin", "Viorel", 1234);

        System.out.println(student1.equals(student2));
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student1.equals(student3));

    }
}
