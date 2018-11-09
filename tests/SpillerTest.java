import org.junit.Test;

import static org.junit.Assert.*;

public class SpillerTest {

    Spiller spiller = new Spiller("testNavn");

    //får den aktuelle værdi for saldoen
    int aktuelSaldo = spiller.getSaldo();

    @Test
    public void addSaldo() {
        //sætter (-2) * den aktuelle saldo og tvinger saldoen til at gå i minus
        //hvis vores metode virker, skal saldoen ALTID blive >= 0
        spiller.addSaldo(-2 * aktuelSaldo);
        System.out.println(spiller.getSaldo());
        assertTrue(spiller.getSaldo() >= 0);
    }
}