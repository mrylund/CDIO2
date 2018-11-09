import org.junit.Test;

import static org.junit.Assert.*;

public class SpillerTest {

    Spiller spiller = new Spiller("testNavn");

    int n = spiller.getSaldo();

    @Test
    public void addSaldo() {
        spiller.addSaldo(-2 * n);
        System.out.println(spiller.getSaldo());
        assertTrue(spiller.getSaldo() >= 0);
    }
}