public class Calculator {
    static class Operatii {

        public static int adunare(int a, int b) {
            return a + b;
        }

        public static int scadere(int a, int b) throws ArithmeticException{
            if(a<b){
                throw new ArithmeticException ("Imposibil");
            }
            return a - b;
        }

        public static int inmultire(int a, int b) {
            return a * b;
        }

        public static int impartire(int a, int b) throws ImpartireLaZeroImposibila{
            if (b == 0) {
                throw new ImpartireLaZeroImposibila("Nu se poate imparti un numar la zero");
            } else {
                return a / b;
            }


        }
    }
}

class ImpartireLaZeroImposibila extends Exception{

    public ImpartireLaZeroImposibila(String mesaj){
        super(mesaj);
    }
}
