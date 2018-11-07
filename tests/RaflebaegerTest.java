import org.junit.Test;

import static org.junit.Assert.*;

public class RaflebaegerTest {
    Raflebaeger rafle = new Raflebaeger();

    @Test
    public void kast() {
    }

    @Test
    public void sum() {
    }

    @Test
    public void isEns() {

    }

    @Test
    public void terningeØjne() {
        //vælg hvor mange gange testen skal køre og angiv fejlprocenten
        final int ANTALTEST = 400000;
        final int PROCENT = 4;

        //arrayet er én længere end antal øjne - den går fra 1 - antal øjne
        int hyppighed[] = new int[rafle.getØjne()+1];
        int total = 0;

        //adder værdier til arrayet
        for(int i = 0; i < ANTALTEST; i++) {
            ++hyppighed[rafle.terningeØjne()];
        }

        System.out.println("Tal\t\tHyppighed");

        //viser værdier, arrayet har antaget og tæller total op
        for(int i = 1; i < hyppighed.length; i++) {
            System.out.println(i + "\t\t" + hyppighed[i]);
            total += hyppighed[i];
        }
        System.out.println("Total:\t" + total);

        //hvad skal de i teorien være og hvor stor fejlprocent, må der være
        final int TEORI = ANTALTEST / rafle.getØjne();
        int fejl = (TEORI) / 100 * PROCENT;

        //hvis alle værdier i arrayet ligger inden for fejlprocenten og alle værdier jeg vil have, er brugt
        for(int i = 1; i < hyppighed.length; i++) {
            assertTrue(hyppighed[i] < TEORI + fejl && hyppighed[i] > TEORI - fejl);
            assertTrue(total == ANTALTEST);
        }
    }
}