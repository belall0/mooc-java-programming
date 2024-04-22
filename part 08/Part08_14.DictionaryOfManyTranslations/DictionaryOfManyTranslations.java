
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        // make sure if the arraylist is initialized for that word or not
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        dictionary.remove(word);
    }

}
