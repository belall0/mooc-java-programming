
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                String[] parts = row.split(",");
                String yearType = "years";
                if (Integer.valueOf(parts[1]) == 1) {
                    yearType = "year";
                }

                System.out.println(parts[0] + ", age: " + parts[1] + " " + yearType);

            }

        } catch (Exception e) {

        }

    }
}
