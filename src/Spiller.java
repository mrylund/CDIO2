public class Spiller {
    private final int STARTSALDO = 1000;
    private int saldo;
    private String navn;

    public Spiller(String Navn) {
        saldo = STARTSALDO;
        navn = Navn;
        //hvis man lavede en static counter, som man talte op hver gang man lavede en spiller fra constuctoren?
        //ville måske virke
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
}
