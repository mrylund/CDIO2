public class Saldo {

    private Raflebaeger rafle;
    private SpillerListe spillerliste = new SpillerListe();

    public void guld() {
        rafle = new Raflebaeger();
        switch (rafle.sum()) {
            case 2: /*skriv noget ud*/ spillerliste.spillere[spillerliste.currentSpiller()].addSaldo(250);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:

        }
    }
}
