
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

        List<Country> countries = new ArrayList<>();

        // read the file
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(l -> l.split(","))
                    .forEach(
                            l -> countries.add(new Country(l[3], Integer.valueOf(l[4]), l[2].split(" ")[1], Double.valueOf(l[5]))));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        countries.stream().sorted().forEach(System.out::println);
        ;
    }

}
