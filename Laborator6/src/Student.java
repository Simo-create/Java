public class Student {
    private String nume;
    private String prenume;
    private int numarMatricol;

    public Student(String nume, String prenume, int numarMatricol){
        this.nume = nume;
        this.prenume = prenume;
        this.numarMatricol = numarMatricol;

    }

    @Override
    public String toString(){

        return "Studentul se numeste: " + nume + prenume
                + " si are numarul matricol" + numarMatricol;

    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return
                false;
        Student student = (Student) obj;
        return numarMatricol == student.numarMatricol;
    }

}
