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
        //hvis man lavede en static counter, som man talte op hver gang man lavede en spiller fra constuctoren?
        //ville måske virke
        spillerTur = counter; //sætter spillerTuren til antal spiller der er blevet lavet
        counter++;
    }

    public String getNavn() {
        return this.navn;
    }

    public int getSpillerTur() {
        return spillerTur; //måske skal man returne counter-1 i stedet for, da den er static?
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
}
