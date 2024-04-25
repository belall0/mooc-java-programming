
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String in = scanner.nextLine();
            if (in.equals("end")) {
                break;
            }
            inputs.add(in);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double avg = inputs.stream().mapToDouble(n -> Double.valueOf(n)).filter(n -> n < 0).average().orElse(0);
            System.out.println("Average of the negative numbers: " + avg);

        } else {
            double avg = inputs.stream().mapToDouble(n -> Double.valueOf(n)).filter(n -> n > 0).average().orElse(0);
            System.out.println("Average of the positive  numbers: " + avg);

        }

        scanner.close();
    }

}
