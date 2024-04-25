
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        // reading user inputs
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, age));
            System.out.println();
        }

        // output
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books: ");

        // sort
        Comparator<Book> bookComparator = Comparator.comparing(Book::getRecommendationAge).thenComparing(Book::getName);
        Collections.sort(books, bookComparator);
        books.forEach(System.out::println);

        scanner.close();

    }

}
