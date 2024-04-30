
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());

        Random rand = new Random();
        while (input > 0) {
            input--;
            System.out.println(rand.nextInt(11));
        }

    }

}
