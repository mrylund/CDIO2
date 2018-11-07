import java.util.Scanner;

public class Spiller {
    private final int STARTSALDO = 1000;
    private int saldo;
    private String navn;
    private static int counter = 0; //tæller op hver gang en spiller bliver lavet
    private int spillerTur = 0;
    private Scanner input = new Scanner(System.in);

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
        if(saldo < 0) {
            saldo = 0;
        }
    }
}
