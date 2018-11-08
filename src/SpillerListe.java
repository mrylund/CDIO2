import java.util.Scanner;

public class SpillerListe {
    private Scanner input;
    private int spillerTur = 0;
    private static int antal = 0;
    Spiller[] spillere;
    Skriv skriv;

    public void addSpiller(int antalSpillere) {
        spillere = new Spiller[antalSpillere];
        input = new Scanner(System.in);
        String temp = "";
        boolean success = false;

        for(int i = 0; i < antalSpillere; i++) {
            do {
                success = false;
                System.out.print(String.format(language.get("SpillerNavn"), (i + 1)));
                temp = input.nextLine();
                if (temp.length() < 11 && temp.length() > 1) {
                    spillere[i] = new Spiller(temp);
                    success = true;
                } else {
                    System.out.println(language.get("NavneLaengde"));
                }
            } while(!success);
        }
    }

    public void slaaIgen() {
        spillerTur = getSpillerTur();
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
        skriv = new Skriv();
        boolean success = false;
        String temp;
        input = new Scanner(System.in);

        do {
            if (isParsableInt(temp = input.nextLine())) {
                antal = Integer.parseInt(temp);
                if(antal < 1 || antal > 10) {
                    System.out.println(language.get("MinMax"));
                    skriv.hvorMangeSpillere();
                } else {
                    success = true;
                }
            } else {
                System.out.println(language.get("NytTal"));
                skriv.hvorMangeSpillere();
            }
        } while(!success);
    }

    private boolean isParsableInt(String input) {
        boolean parsable = true;
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            parsable = false;
        }
        return parsable;
    }

    public int getAntal() {
        return antal;
    }

    public int getSpillerTur() {
        return spillerTur;
    }

}
