public class Saldo {
    private final int STARTPENGE = 1000;
    private final int SLUTPENGE = 3000;
    private int saldo = STARTPENGE;
    private Raflebaeger rafle;

    public void guld() {
        rafle = new Raflebaeger();
        switch (rafle.sum()) {
            case 2: /*skriv noget ud*/ saldo += 250;
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

    public int getSaldo() {
        return saldo;
    }
    public int getSLUTPENGE() {
        return SLUTPENGE;
    }
}
