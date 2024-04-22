import java.util.Scanner;

public class LiquidContainers {

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
                // add command
                if (value < 0) {
                    continue;
                }

                fContainer.add(value);
            } else if (command.equals("move")) {
                if (value < 0) {
                    continue;
                }

                if (value > fContainer.getAmount()) {
                    value = fContainer.getAmount();
                }

                fContainer.remove(value);
                sContainer.add(value);
            } else if (command.equals("remove")) {
                sContainer.remove(value);
            }

        }

    }

}
