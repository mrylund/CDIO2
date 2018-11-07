public class Saldo {

    private Raflebaeger rafle;
    private SpillerListe spillerliste = new SpillerListe();
    private final int SLUTPENGE = 3000;


    public void guld(Spiller spiller, int antal) {
        switch (antal) {
            case 2: spiller.addSaldo(250);
                System.out.println("");
                    break;
            case 3: spiller.addSaldo(-100);
            break;
            case 4: spiller.addSaldo(100); break;
            case 5: spiller.addSaldo(-20); break;
            case 6: spiller.addSaldo(180); break;
            case 7: spiller.addSaldo(0); break;
            case 8: spiller.addSaldo(-70); break;
            case 9: spiller.addSaldo(60); break;
            case 10: spiller.addSaldo(-80); break;
            case 11: spiller.addSaldo(-50); break;
            case 12: spiller.addSaldo(650);

            break;

        }
    }

    public int getSLUTPENGE() {
        return SLUTPENGE;
    }
}
