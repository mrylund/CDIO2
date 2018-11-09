public class Saldo {
    private static final int SLUTPENGE = 3000;


    public void guld(Spiller spiller, int antal) {
        switch (antal) {
            case 2: spiller.addSaldo(250); Skriv.felt(2); break;
            case 3: spiller.addSaldo(-100); Skriv.felt(3); break;
            case 4: spiller.addSaldo(100); Skriv.felt(4); break;
            case 5: spiller.addSaldo(-20); Skriv.felt(5); break;
            case 6: spiller.addSaldo(180); Skriv.felt(6); break;
            case 7: spiller.addSaldo(0); Skriv.felt(7); break;
            case 8: spiller.addSaldo(-70); Skriv.felt(8);break;
            case 9: spiller.addSaldo(60); Skriv.felt(9); break;
            case 10: spiller.addSaldo(-80); Skriv.felt(10);break;
            case 11: spiller.addSaldo(-50); Skriv.felt(11);break;
            case 12: spiller.addSaldo(650); Skriv.felt(12); break;
        }
    }

    public static int getSLUTPENGE() {
        return SLUTPENGE;
    }
}
