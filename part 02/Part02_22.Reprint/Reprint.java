
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int nums = Integer.valueOf(scanner.nextLine());

        while (nums > 0) {
            printText();
            nums--;
        }
    }

    public static void printText() {
        // write some code here
        System.out.println("In a hole in the ground there lived a method");
    }
}
