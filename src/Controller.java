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
    }

    public void spilControl() {
        spillerliste.addSpiller(spillerliste.getAntal());
        skriv.nyLinje();
        skriv.hvemSpiller(spillerliste.spillere);
        skriv.nyLinje();

        while(true) {
            skriv.spillertur(spillerliste.getCurrentSpillerNavn());
            skriv.venterPaaSlag();
            skriv.trykEnter();
            rafle.kast();
            System.out.println(rafle.toString(rafle.getTerninger()));
            skriv.visSum();
            System.out.println(rafle.sum());
            saldo.guld(spillerliste.getCurSpiller(), rafle.sum());
            skriv.resultat(spillerliste.getSpillere());
            if (spillerliste.getCurSpiller().isVinder()) {
                skriv.vinder(spillerliste.getCurSpiller());
                break;
            }

            if(rafle.ekstraTur()) {
                spillerliste.slaaIgen();
            } else {
                spillerliste.nextSpiller();
            }

            skriv.nyLinje();
            skriv.nyLinje();
        }

    }
}
