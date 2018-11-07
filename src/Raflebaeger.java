public class Raflebaeger {

    private int øjne = 6;
    private int antalTerninger = 2;
    private int dice;
    private int terningeSum = 0;
    private int[] terninger;
    private String arrayString = "";

    private int terningeØjne() {
        return dice = (int)(Math.random() * øjne + 1); //værdi fra 1 til øjne-værdi
    }

    public int[] Kast() {
        terninger = new int[antalTerninger];
        for(int i = 0; i < terninger.length; i++) {
            terninger[i] = terningeØjne();
        }
        return terninger;
    }

    public int sum() {
        terningeSum = 0;
        for(int i = 0; i < terninger.length; i++) {
            terningeSum += terninger[i];
        }
        return terningeSum;
    }

    public String toString(int[] arr) {
        arrayString = "";
        arrayString += "(";
        for(int i = 0; i < arr.length; i++) {
            arrayString += "[" + arr[i] + "]";
        }
        arrayString += ")";
        arrayString = arrayString.replace("][","], [");
        return arrayString;
        //([], [], [], [], [], [])
    }

    public boolean isEns() {
        int n = terninger[0];
        int counter = 0;
        for(int i = 1; i < terninger.length; i++) {
            if(terninger[i] == n) {
                counter++;
            }
        }
        return counter == terninger.length;
    }

    //get og set metoder
    public int getØjne() {
        return øjne;
    }
    public int getAntalTerninger() {
        return antalTerninger;
    }
    public int[] getTerninger() {
        return terninger;
    }

    public int setØjne(int antalØjne) {
        return øjne = antalØjne;
    }
    public int setAntalTerninger(int antalTerninger) {
        return this.antalTerninger = antalTerninger;
    }
}