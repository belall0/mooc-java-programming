
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int cnt = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(myScanner.nextLine());

            if (num == 0) {
                break;
            }

            cnt++;

        }
        System.out.println("Number of numbers: " + cnt);

    }
}
