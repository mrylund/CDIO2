public class main {
    public static void main(String[] args) {
        Skriv skriv = new Skriv();
        SpillerListe spillerliste = new SpillerListe();

        skriv.intro();
        skriv.regler();
        skriv.hvorMangeSpillere();
        spillerliste.antalSpillere();

        new Controller(spillerliste.getAntal()).spilControl();
    }
}
