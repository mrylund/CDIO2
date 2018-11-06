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


}
