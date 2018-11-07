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
            System.out.print(String.format(language.get("SpillerNavn"),(i + 1)));
            spillere[i] = new Spiller(input.nextLine());
        }
    }

    public void nextSpiller() {
        if(spillerTur == spillere.length-1) { //navne.length måske +1 elle -1. Kommer an på hvordan vi index'ere spillerne
            spillerTur = 0;
        } else {
            spillerTur++;
        }
    }

    public Spiller getCurSpiller() {
        return spillere[this.getCurrentSpillerNr()];
    }

    public Spiller[] getSpillere() {
        return spillere;
    }

    public int getCurrentSpillerNr() {
        return spillerTur;
    }



    public String getCurrentSpillerNavn() {
        return spillere[spillerTur].getNavn();
    }

    public void antalSpillere() {
        input = new Scanner(System.in);
        antal = input.nextInt();
    }

    public int getAntal() {
        return antal;
    }

}
