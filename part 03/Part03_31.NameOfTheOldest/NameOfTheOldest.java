
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");

            int currAge = Integer.valueOf(parts[1]);

            if (oldest < currAge) {
                oldestName = parts[0];
                oldest = currAge;
            }

        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
