
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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

        double avg = inputs.stream().mapToDouble(num -> Double.valueOf(num)).average().orElse(0);
        System.out.println("average of the numbers: " + avg);

    }

}
