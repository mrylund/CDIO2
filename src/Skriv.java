public class Skriv {

    public void hvorMangeSpillere() {
        System.out.print("Hvor mange spillere er I?: ");
    }

    public void hvemSpiller(String[] navne) {
        System.out.println("Spillere i dette spil: ");
        for(int i = 0; i < navne.length; i++) {
            System.out.println("Spiller " + (i+1) + ": " + navne[i]);
        }
    }
}
