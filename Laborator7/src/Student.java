public class Student {
    private String nume;
    private int nota;
    private String andestudiu;

    public Student(String nume){
        this.nume = nume;
        this.nota = 0;
        this.andestudiu = " ";
    }

    public Student(String nume, int nota){
        this.nume = nume;
        this.nota = nota;
        this.andestudiu = " ";
    }

    public Student(String nume, int nota, String andestudiu){
        this.nume = nume;
        this.nota = nota;
        this.andestudiu = andestudiu;
    }

    @Override
    public String toString(){
        return "Studentul are numele " + nume +
                " este student in anul  " + andestudiu
                + " si are nota " + nota;

    }


}
