import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Skriv {

    Saldo saldo = new Saldo();
    Raflebaeger bæger = new Raflebaeger();
    SpillerListe spillerliste = new SpillerListe();
    private String rules;
    private String intro;

    public Scanner input = new Scanner(System.in);


    public void hvorMangeSpillere() {
        System.out.print(language.get("AntalSpillere"));
    }

    public void trykEnter() {
        input.nextLine();
    }

    public void streg(){
        System.out.println("_____________________________");
    }

    public void visSum(int felt) {
        System.out.println(String.format(language.get("DuSlogTotal"), felt));
    }

    public void hvemSpiller(Spiller[] navne) {
        System.out.println(language.get("Spillere"));
        for(int i = 0; i < navne.length; i++) {
            System.out.println(String.format(language.get("Spiller"), i+1, navne[i].getNavn()));
        }
    }

    public void resultat(Spiller[] spillere) {
        for(int i = 0; i < spillerliste.getAntal(); i++) {
            System.out.println(String.format(language.get("SpillerSaldo"),spillere[i].getNavn(), spillere[i].getSaldo()));
        }

    }

    public void spillertur(String navn) {
        System.out.println(String.format(language.get("SpillerTur"), navn));
    }

    public void hvilketSprog() {
        boolean success = false;
        System.out.print("Vælg dansk eller engelsk [dk], [eng]: ");
        do {
            String input1 = input.nextLine();
            if (input1.equalsIgnoreCase("dk") || input1.equalsIgnoreCase("eng")) {
                language.setLanguage(input1);
                success = true;
            } else {
                System.out.print("Invalid input! Try entering [dk] or [eng] again: ");
            }

        }while(!success);

    }

    public void venterPaaSlag() {
        System.out.print(language.get("EnterSlaa"));
    }

    public void nyLinje() {
        System.out.println();
    }

    public void intro(){
        String filnavn = "lang/intro_" + language.getLanguage().toUpperCase() + ".txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filnavn));
            String currentLine = "";

            for(int i = 0; i < 12; i++){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void vinder(Spiller spiller) {
        System.out.println(String.format(language.get("Vinder"), spiller.getNavn(), spiller.getSaldo()));
    }

    public void regler(){
        String file1 = "lang/regler_DK.txt"; //+ sprog.getLanguage() + ".txt";
        String file2 = "lang/regler_ENG.txt";
        String currentLine = "";

        rules = input.nextLine();

        if (rules.equalsIgnoreCase("REGLER")) {

            try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                for(int i = 0; i < 23; i++){
                    System.out.println(currentLine);
                    currentLine = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if(rules.equalsIgnoreCase("RULES")){

            try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
                for(int i = 0; i < 23; i++){
                    System.out.println(currentLine);
                    currentLine = reader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
