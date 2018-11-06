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

    public void setSaldo(int nySaldo) {
        saldo = nySaldo;
    }

    public void addSaldo(int maengde) {
        saldo += maengde;
    }

    public static void main(String[] args) {
        Spiller spiller = new Spiller("Test");

        System.out.println(spiller.getNavn());
        System.out.println(spiller.getSaldo());
    }
}
