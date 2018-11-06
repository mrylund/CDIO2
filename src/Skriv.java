import java.util.Scanner;

public class Skriv {
    Scanner input;

    public void hvorMangeSpillere() {
        int antal;
        input = new Scanner(System.in);
        System.out.print(hvorMange(String sprog)); //Hvor mange spillere er I?:
        antal = input.nextInt();
    }

    public void hvemSpiller(String[] navne) {
        System.out.println(hvemErMed(String sprog)); //Spillere i dette spil:
        for(int i = 0; i < navne.length; i++) {
            System.out.println(spiller(String sprog) + i+1 + ": " + navne[i]); //Spiller
        }
    }
}
