public class Chitara extends InstrumentMuzical implements Acordabil{

        private  int numarCorzi;

        public void acordeaza(){
                System.out.println("Trebuie sa acordati chitara");

        };

        public Chitara(String tip, double pret, int numarCorzi )
        {
                super(tip, pret);
                this.numarCorzi = numarCorzi;
        }

        @Override
        public void canta(){
                System.out.println("Instrumentul " + tip + "  are pret "+ pret +
                        " si are " + numarCorzi+" corzi");

        }
}
