import org.junit.Test;

import static org.junit.Assert.*;

public class SpillerTest {

    Spiller spiller = new Spiller("testNavn");

    @Test
    public void addSaldo() {
        //får den aktuelle værdi for saldoen
        int aktuelSaldo = spiller.getSaldo();

        //sætter (-2) * den aktuelle saldo adderet med 1 og tvinger saldoen til at gå i minus
        //hvis vores metode virker, skal saldoen ALTID blive = 0
        spiller.addSaldo(-2 * (aktuelSaldo + 1));
        System.out.println(spiller.getSaldo());
        assertTrue(spiller.getSaldo() == 0);
    }

    @Test
    public void setSaldo() {
        //gemmer aktuel saldo og to andre variable til at teste
        int aktuelSaldo = spiller.getSaldo();
        int nySaldo = 500;
        int nySaldo_minus = -500;

        //saldoen skal ikke ændres, hvis man sætter et minus beløb ind
        spiller.setSaldo(nySaldo_minus);
        assertTrue(spiller.getSaldo() == aktuelSaldo);

        //saldoen skal ændres til ny saldo, hvis det er det er >= 0
        spiller.setSaldo(nySaldo);
        assertTrue(spiller.getSaldo() == nySaldo);
    }
}