
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container fContainer = new Container();
        Container sContainer = new Container();

        while (true) {
            // print the current state
            System.out.println();
            System.out.println("First: " + fContainer);
            System.out.println("Second: " + sContainer);

            // get the command
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String command = input.split(" ")[0];
            int value = Integer.valueOf(input.split(" ")[1]);

            // control user commands
            if (command.equals("add")) {
                fContainer.add(value);
            } else if (command.equals("move") && value > 0) {

                if (value > fContainer.contains()) {
                    value = fContainer.contains();
                }

                fContainer.remove(value);
                sContainer.add(value);
            } else if (command.equals("remove")) {
                sContainer.remove(value);
            }

        }
        scan.close();

    }

}
