
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {

    public static void main(String[] args) {

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .forEach(arr -> books.add(new Book(arr[0], Integer.valueOf(arr[1]), Integer.valueOf(arr[2]), arr[3])));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }
}
