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
        skriv.streg();
        skriv.nyLinje();

        while (true) {
            skriv.spillertur(spillerliste.getCurrentSpillerNavn());
            skriv.venterPaaSlag();
            skriv.trykEnter();
            skriv.streg();
            rafle.kast();
            skriv.tekst(spillerliste.getCurSpiller(),rafle.sum());
            System.out.println(rafle.toString(rafle.getTerninger()));
            skriv.visSum(rafle.sum());
            saldo.guld(spillerliste.getCurSpiller(), rafle.sum());
            skriv.resultat(spillerliste.getSpillere());
            if (spillerliste.getCurSpiller().isVinder()) {
                skriv.nyLinje();
                skriv.vinder(spillerliste.getCurSpiller());
                break;
            }

            if(rafle.ekstraTur()) {
                spillerliste.slaaIgen();
            } else {
                spillerliste.nextSpiller();
            }
            skriv.streg();
            skriv.nyLinje();
        }
    }
}
