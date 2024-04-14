
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            String year = scanner.nextLine();

//             add to arrayList
            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed? ");
        String typeOfInfo = scanner.nextLine();

        if (typeOfInfo.equals("everything")) {
            for (Book i : books) {
                System.out.println(i);
            }
        } else {
            for (Book i : books) {
                System.out.println(i.getName());
            }
        }

    }
}
