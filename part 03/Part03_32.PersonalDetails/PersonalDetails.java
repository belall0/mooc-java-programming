
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        double years = 0;
        int numOfPersons = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            numOfPersons++;
            String[] parts = input.split(",");

            // check the longest
            if (parts[0].length() > longest.length()) {
                // update longest
                longest = parts[0];
            }

            // add birthyears
            years += Integer.valueOf(parts[1]);
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + years / numOfPersons);

    }
}
