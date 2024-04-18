
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner, ArrayList<Bird> birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                addBird();
            } else if (command.equals("Observation")) {
                observeBird();
            } else if (command.equals("All")) {
                printBirds();
            } else if (command.equals("One")) {
                printOneBird();
            } else if (command.equals("Quit")) {
                break;
            }
        }
    }

    public void printOneBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();

        for (Bird b : birds) {
            if (b.getName().equals(birdName)) {
                System.out.println(b);
            }
        }
    }

    public void printBirds() {
        for (Bird b : birds) {
            System.out.println(b);
        }

    }

    public void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();

        Bird newBird = new Bird(name, latinName);
        birds.add(newBird);

    }

    public void observeBird() {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine();

        boolean founded = false;
        for (Bird b : birds) {
            if (b.getName().equals(birdName)) {
                b.observe();
                founded = true;
                break;
            }
        }

        if (!founded) {
            System.out.println("Not a bird!");
        }

    }

}
