
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int numOfPos = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");

            int num = Integer.valueOf(myScanner.nextShort());

            if (num == 0) {
                break;
            } else if (num > 0) {
                sum += num;
                numOfPos++;
            }

        }

        if (numOfPos == 0) {
            System.out.println("Cannot calculate the average");
        } else {

            System.out.println(1.0 * sum / numOfPos);
        }

    }
}
