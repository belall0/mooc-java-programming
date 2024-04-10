
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numOfNums = 0;
        int numOfEvens = 0;
        int numOfOdds = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (num % 2 == 0) {
                numOfEvens++;
            } else {
                numOfOdds++;
            }

            sum += num;
            numOfNums++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + 1.0 * sum / numOfNums);
        System.out.println("Even: " + numOfEvens);
        System.out.println("Odd: " + numOfOdds);
        scanner.close();

    }
}
