
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (value < 0) {
                continue;
            }

            if (command.equals("add")) {
                first = (first + value > 100 ? 100 : first + value);
            } else if (command.equals("move")) {

                if (first < value) {
                    second = (second + first > 100 ? 100 : second + first);

                    first = 0;
                } else {
                    second = (second + value > 100 ? 100 : second + value);

                    first -= value;
                }

            } else if (command.equals("remove")) {
                second = (second - value < 0 ? 0 : second - value);
            }

        }

    }

}
