import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class language {
    private HashMap<String, String> langs = new HashMap<String, String>;
    public language() {
        String filnavn = "lang/Dansk.txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filnavn));
            String lines;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
