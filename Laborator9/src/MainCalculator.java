public class MainCalculator {
    public static void main(String[] args) throws ImpartireLaZeroException,ScadereNegativa {
       try{
            System.out.println("Rezultatul împărțirii: " +
                    Calculator.Operatii.impartire(10, 0));
           System.out.println("Rezultatul scaderii: " +
                   Calculator.Operatii.scadere(2,6));
        } catch (ImpartireLaZeroException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (ScadereNegativa e){
           System.out.println("Eroare:" +e.getMessage());
       }

        try{
            System.out.println("Rezultatul scaderii: " +
                    Calculator.Operatii.scadere(2,6));
        } catch (ScadereNegativa e){
            System.out.println("Eroare:" +e.getMessage());
        }

        System.out.println("Rezultatul adunarii numerelor este " + Calculator.Operatii.adunare(2,3));
        System.out.println("Rezultatul scaderii numerelor este " + Calculator.Operatii.scadere(5,2));
    }
}