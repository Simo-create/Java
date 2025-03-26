
class Calculator {

    static class Operatii{
        public static int adunare(int a, int b){
            return a+b;
        }

        public static int scadere(int a, int b) throws ArithmeticException, ScadereNegativa{
            if (a-b< 0) {
                throw new ScadereNegativa("Scadere negativa");
            }
            return a-b;
        }

        public static int inmultire(int a, int b){
            return a*b;
        }

        public static int impartire(int a, int b) throws ArithmeticException, ImpartireLaZeroException {
            if(b==0){
                throw new ImpartireLaZeroException("numarul nu se poate imparti la zero");
            }
            else{
                return a/b;
            }

        }
    }
}
// clasele statice permit o mai buna organizare a codului
// economiseste spatiul
// nu se mai creaza inca o instanta