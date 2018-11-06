public class Controller {
    private int spillere;
    private Saldo saldo;
    private Spiller spiller;
    private Raflebaeger rafle;
    private Skriv skriv;

    public Controller(int antalSpillere) {
        spillere = antalSpillere;
        saldo = new Saldo();
        rafle = new Raflebaeger();
        spiller = new Spiller();
        skriv = new Skriv();
    }

    public void gameControl() {
        skriv.hvorMangeSpillere();
    }
}
