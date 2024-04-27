package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaveableDictionary {

    private Map<String, String> words;
    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.words.put(parts[0], parts[1]);
                        this.words.put(parts[1], parts[0]);
                    });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (words.containsKey(word)) {
            return;
        }
        words.put(word, translation);
        words.put(translation, word);
    }

    public String translate(String word) {
        return words.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);
        words.remove(word);
        words.remove(translation);
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));

            List<String> allreadySaved = new ArrayList<>();
            words.keySet().stream().forEach(word -> {
                if (allreadySaved.contains(word)) {
                    return;
                }
                String line = word + ":" + words.get(word);
                writer.println(line);
                allreadySaved.add(word);
                allreadySaved.add(words.get(word));
            });

            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
