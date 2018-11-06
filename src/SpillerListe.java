import java.util.Scanner;

public class SpillerListe {
    private Scanner input;
    private int spillerTur = 0;
    private static int antal = 0;
    Spiller[] spillere;

    public void addSpiller(int antalSpillere) {
        spillere = new Spiller[antalSpillere];
        input = new Scanner(System.in);
        for(int i = 0; i < antalSpillere; i++) {
            System.out.print("Navn på spiller " + (i + 1) + ": ");
            spillere[i] = new Spiller(input.nextLine());
        }
    }

    public int nextSpiller(int forigeSpiller) {
        spillerTur = forigeSpiller;
        if(spillerTur == spillere.length) { //navne.length måske +1 elle -1. Kommer an på hvordan vi index'ere spillerne
            spillerTur = 0;
        } else {
            spillerTur++;
        }
        return spillerTur;
    }

    public int currentSpiller() {
        return spillerTur;
    }

    public void antalSpillere() {
        input = new Scanner(System.in);
        antal = input.nextInt();
    }

    public int getAntal() {
        return antal;
    }

}
