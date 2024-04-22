
import java.util.HashMap;
import java.util.Collection;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        Collection<Book> books = hashmap.values();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        Collection<Book> books = hashmap.values();
        for (Book book : books) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }

    }

}
