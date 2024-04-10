
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        // check if zero
        if (num == 0) {
            System.out.println("Factorial: " + 1);

            scanner.close();
            return;
        }

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }

        System.out.println("Factorial: " + result);

    }
}
