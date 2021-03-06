import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Skriv {
    SpillerListe spillerliste = new SpillerListe();
    private String rules;

    public Scanner input = new Scanner(System.in);

    public static void felt(int felt) {
        System.out.println(language.get("Felt" + felt));
    }

    public void tekst(Spiller spiller, String terninger, int sum){
        System.out.println(String.format(language.get("SpillerSlag"), spiller.getNavn(), terninger, sum));
    }
    public void hvorMangeSpillere() {
        System.out.print(language.get("AntalSpillere"));
    }

    public void trykEnter() {
        input.nextLine();
    }

    public void streg(){
        System.out.println("_____________________________");
    }

    public void hvemSpiller(Spiller[] navne) {
        System.out.println(language.get("Spillere"));
        for(int i = 0; i < navne.length; i++) {
            System.out.println(String.format(language.get("Spiller"), i+1, navne[i].getNavn(), navne[i].getSaldo()));
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
            if (input1.equalsIgnoreCase("dk") || input1.equalsIgnoreCase("eng") || input1.equalsIgnoreCase("sj")) {
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

            for(int i = 0; i < 13; i++){
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
        String file3 = "lang/regler_SJ.txt";
        String currentLine = "";

        rules = input.nextLine();

        if (rules.equalsIgnoreCase("REGLER")) {

            try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
                for(int i = 0; i < 23; i++){
                    System.out.println(currentLine);
                    currentLine = reader.readLine();
                }
                nyLinje();
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
                nyLinje();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else if(rules.equalsIgnoreCase("Æ REGLER")){
            try (BufferedReader reader = new BufferedReader(new FileReader(file3))) {
                for(int i = 0; i < 26; i++){
                    System.out.println(currentLine);
                    currentLine = reader.readLine();
                }
                nyLinje();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
