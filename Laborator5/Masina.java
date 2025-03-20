//1.Crearea clasei Masina și explorarea constructorilor

public class Masina {
    private String brand;
    private double CC;

    public Masina (){
        this.brand = " ";
        this.CC = 0;
    }

    public Masina(String brand, double CC)
    {
        this.brand = "AUDI";
        this.CC = 2000;
    }

    public String getBrand() {
        return brand;
    }

    public double getCC() {
        return CC;
    }

    //3.Supraincărcarea metodelor (Method Overloading)
    // setBrand cu o valoare implicita
    public void setBrand() {
        this.brand = "Default Brand";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCC(double CC) {
        this.CC = CC;
    }

  //2.Explorarea metodei toString()

    @Override
    public String toString(){

        return "Masina Brand: " + brand + ", Capacitate cilindrica: " + CC;

    }
}
