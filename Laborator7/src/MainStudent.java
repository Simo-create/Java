public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Mircea");
        Student student2 = new Student("Alina", 8);
        Student student3 = new Student("Vali", 9, "2");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }
}
