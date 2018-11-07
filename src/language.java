import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class language {
    // Der defineres et nyt Hashmap hvor vi vil indsætte strings.
    private static HashMap<String, String> langs = new HashMap<String, String>();
    private static String languagestr;
    public static void setLanguage(String lang) {
        languagestr = lang;
        // Filen bliver indlæst
        String filnavn = "lang/" + lang.toUpperCase() + ".txt";
        try {
            // Der loopes gennem linjerne i language filen og tilføjer language strings til HashMappet.
            BufferedReader reader = new BufferedReader(new FileReader(filnavn));
            String lines;
            while ((lines = reader.readLine()) != null) {
                String[] line = lines.split("; ");
                langs.put(line[0], line[1]);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get Metode til at få en language string ud fra en key.
    public static String get(String key) {
        return langs.get(key);
    }
    public static String getLanguage() {
        return languagestr;
    }
}
