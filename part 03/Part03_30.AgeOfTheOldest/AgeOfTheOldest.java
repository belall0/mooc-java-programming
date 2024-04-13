
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            int currAge = Integer.valueOf(input.split(",")[1]);

            if (oldest < currAge) {
                oldest = currAge;
            }

        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
