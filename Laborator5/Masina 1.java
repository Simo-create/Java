public class Masina {
    //1. Definiți o clasă Masina cu atribute private pentru brand și capacitate cilindrică
    //(cc).
    //o Construiți un constructor default și unul parametrizat pentru a inițializa valorile
    //atributelor.
    //o Instanțiați obiecte de tip Masina și afisați valorile prin metode getter.


    private String brand;
    private int CC;
    private Motor motor;

//    public Masina (){
//        this.brand = "AUDI";
//        this.CC = 2000;
//        this.motor = motor;
//    }

    public Masina (String brand, int CC, Motor motor) {
        this.brand = brand;
        this.CC = CC;
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public int getCC() {
        return CC;
    }

    //  2.Explorarea metodei toString()
    @Override
    public String toString(){

        return "Masina are marca :  " + brand +
                " si capacitatea cilindrica de " + CC +
                " si motorul " + motor.toString();

    }

    //3.Supraincărcarea metodelor (Method Overloading)
    // setBrand cu o valoare implicita
    public void setBrand() {
        this.brand = "Default Brand";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public Motor getMotor(){
        return  motor;
    }

}
