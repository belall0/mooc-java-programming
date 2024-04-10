
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int numOfNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");

            int num = Integer.valueOf(myScanner.nextShort());

            if (num == 0) {
                break;
            }

            sum += num;
            numOfNumbers++;
        }

        System.out.println("Average of the numbers: " + 1.0 * sum / numOfNumbers);

    }
}
