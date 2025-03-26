public class A {
    public static void doSometh(int nr) throws Exc1, Exc2{
        if (nr > 10) {
            throw new Exc1();
        } else {
            throw new Exc2();
        }
    }
}

class Exc1 extends Exception{
    public Exc1(){
        System.out.println("Exceptia1");
    }
}

class Exc2 extends Exception{
    public Exc2(){
        System.out.println("Exceptia2");
    }


}