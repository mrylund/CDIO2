public class main {
    public static void main(String[] args) {
        Skriv skriv = new Skriv();
        Spiller spiller = new Spiller();

        skriv.intro();
        skriv.regler();
        skriv.hvorMangeSpillere();
        spiller.antalSpillere();
        new Controller(spiller.getAntal()).spilControl();
    }
}
