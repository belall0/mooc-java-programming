
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                return;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();

                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                dictionary.add(word, translation);

                continue;
            } else if (command.equals("search")) {

                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();

                System.out.println("Translation: "
                        + (dictionary.translate(word) == null ? "Word " + word + " was not found " : dictionary.translate(word)));
                continue;
            }

            System.out.println("Unknown command");
        }

    }

}
