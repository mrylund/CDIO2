import java.util.Arrays;

public class Controller {
    private int spillere;
    private Saldo saldo;
    private Spiller spiller;
    private SpillerListe spillerliste;
    private Raflebaeger rafle;
    private Skriv skriv;

    public Controller(int antalSpillere) {
        spillere = antalSpillere;
        spillerliste = new SpillerListe();
        saldo = new Saldo();
        rafle = new Raflebaeger();
        skriv = new Skriv();
        int spillerTur = 0;
    }

    public void spilControl() {

        spillerliste.addSpiller(spillerliste.getAntal());
        skriv.nyLinje();
        skriv.hvemSpiller(spillerliste.spillere);
        skriv.nyLinje();

        while(true) {
            skriv.venterPaaSlag();
            skriv.venterPaaEnter();
            rafle.Kast();
            System.out.println(rafle.toString(rafle.getTerninger()));
        }
    }
}
