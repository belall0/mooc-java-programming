
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            Double num = Double.valueOf(myScanner.nextLine());

            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(Math.pow(num, 2));
            }

        }

    }
}
