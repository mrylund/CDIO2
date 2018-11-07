import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Skriv {

    Saldo saldo = new Saldo();
    Raflebaeger bæger = new Raflebaeger();
    language sprog = new language();
    private String rules;
    public Scanner input = new Scanner(System.in);


    public void hvorMangeSpillere() {
        System.out.print("Hvor mange spillere er I?: ");
    }

    public void trykEnter() {
        input.nextLine();
    }

    public void hvemSpiller(Spiller[] navne) {
        System.out.println("Spillere i dette spil: ");
        for(int i = 0; i < navne.length; i++) {
            System.out.println("Spiller " + (i+1) + ": " + navne[i].getNavn());
        }
    }

    public void hvilketSprog() {
        System.out.print("Vælg dansk eller engelsk [dk], [eng]: ");
        sprog.setLanguage(input.nextLine());
    }

    public void venterPaaSlag() {
        System.out.println("Tryk ENTER for at slå: ");
    }

    public void nyLinje() {
        System.out.println();
    }

    public void intro(){
        System.out.println(" ________________________________________________________");
        System.out.println("|                    INTRODUKTION                        |");
        System.out.println("|        !!!Velkommen til terningespillet!!!             |");
        System.out.println("|________________________________________________________|");
        System.out.print("| * I dette spil, skal der rulles med 2 terninger.       |" + "\n" +
                "|   - Hver spiller starter med en saldo på 1000 guld     |" + "\n" +
                "|   - Den spiller, som når til " + saldo.getSLUTPENGE() + " guld først,          | "
                + "\n" + "|     vinder spillet                                     |");
        System.out.println();
        System.out.println("| * Du kan få oplyst reglerne ved at skrive \"REGLER\".    |");
        System.out.println("| * Tryk på \"ENTER\", for at komme videre i spillet!      |");
        System.out.println("|________________________________________________________|");

    }

    public void regler(){
        String file1 = "lang/regler_DK.txt";
        String file2 = "regler_ENG.txt";
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
