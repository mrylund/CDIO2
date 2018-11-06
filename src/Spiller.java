import java.util.Scanner;

public class Spiller {
    private Saldo saldo;
    private int spillerTur = 0;
    private Scanner input;
    private String[] navne;
    private static int antal;

    public void addSpiller(int antalSpillere) {
        input = new Scanner(System.in);
        navne = new String[antalSpillere];
        for(int i = 0; i < antalSpillere; i++) {
            System.out.print("Navn på spiller" + (i+1) + ": ");
            navne[i] = input.nextLine();
        }
    }

    public void antalSpillere() {
        input = new Scanner(System.in);
        antal = input.nextInt();
    }

    public int nextSpiller(int forigeSpiller) {
        spillerTur = forigeSpiller;
        if(spillerTur == navne.length) { //navne.length måske +1 elle -1. Kommer an på hvordan vi index'ere spillerne
            spillerTur = 0;
        } else {
            spillerTur++;
        }
        return spillerTur;
    }

    public boolean isVinder() {
        saldo = new Saldo();
        return saldo.getSaldo() == saldo.getSLUTPENGE();
    }

    public String[] getNavne() {
        return navne;
    }

    public int getAntal() {
        return antal;
    }


}
