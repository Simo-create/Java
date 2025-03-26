import java.util.ArrayList;
import java.util.List;

public class MainInstrumentMuzical {
    public static void main(String[] args) {
        InstrumentMuzical.descriereInstrument(); // descriere instrument este o metoda statica,
        // apartine clasei si nu are nevoie de a se crea un obiect, instanta a clasei
        // legare statica, se face la compilare

        InstrumentMuzical chitara = new Chitara("chitara clasica", 1000, 6);
        InstrumentMuzical trompeta = new Trompeta("mare", 1200);
        List<InstrumentMuzical> lista = new ArrayList<>();

        chitara.afiseazaDetalii();
        chitara.canta();

        ((Acordabil)chitara).acordeaza();
        trompeta.canta();
        chitara.canta();

        List<InstrumentMuzical> instrumentMuzical = new ArrayList<>();
        instrumentMuzical.add(chitara);
        instrumentMuzical.add(trompeta);

        for(InstrumentMuzical instrument: lista){
            instrument.canta();
        }

    }
}
