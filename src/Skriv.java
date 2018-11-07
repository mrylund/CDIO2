import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Skriv {

    Saldo saldo = new Saldo();
    Raflebaeger bæger = new Raflebaeger();
    language sprog = new language();
    SpillerListe spillerliste = new SpillerListe();
    private String rules;
    private String intro;

    public Scanner input = new Scanner(System.in);


    public void hvorMangeSpillere() {
        System.out.print("Hvor mange spillere er I?: ");
    }

    public void trykEnter() {
        input.nextLine();
    }

    public void visSum() {
        System.out.print("Du slog i alt: ");
    }

    public void hvemSpiller(Spiller[] navne) {
        System.out.println("Spillere i dette spil: ");
        for(int i = 0; i < navne.length; i++) {
            System.out.println("Spiller " + (i+1) + ": " + navne[i].getNavn());
        }
    }

    public void resultat(Spiller[] spillere) {
        for(int i = 0; i < spillerliste.getAntal(); i++) {
            System.out.println(spillere[i].getNavn() + ": " + spillere[i].getSaldo());
        }
    }

    public void spillertur(String navn) {
        System.out.println("Det er nu " + navn + "s tur.");
    }

    public void hvilketSprog() {
        boolean success = false;
        System.out.print("Vælg dansk eller engelsk [dk], [eng]: ");
        do {
            String input1 = input.nextLine();
            if (input1.equalsIgnoreCase("dk") || input1.equalsIgnoreCase("eng")) {
                sprog.setLanguage(input1);
                success = true;
            } else {
                System.out.print("Invalid input! Try entering [dk] or [eng] again: ");
            }

        }while(!success);

    }

    public void venterPaaSlag() {
        System.out.println("Tryk ENTER for at slå: ");
    }

    public void nyLinje() {
        System.out.println();
    }

    public void intro(){
        String filnavn = "lang/intro_" + sprog.getLanguage().toUpperCase() + ".txt";

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
