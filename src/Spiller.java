import java.util.Scanner;

public class Spiller {
    private final int STARTSALDO = 1000;
    private int saldo;
    private String navn;

    public Spiller(String Navn) {
        saldo = STARTSALDO;
        navn = Navn;
    }

    public String getNavn() {
        return this.navn;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public boolean isVinder() {
        return this.saldo >= Saldo.getSLUTPENGE();
    }

    public void addSaldo(int maengde) {
        saldo += maengde;
        if(saldo < 0) {
            saldo = 0;
        }
    }
}
