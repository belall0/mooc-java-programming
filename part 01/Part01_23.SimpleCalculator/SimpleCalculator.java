
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // read the first number
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(myScanner.nextLine());

        // read the second number
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(myScanner.nextLine());

        // the calculator + - * /
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (1.0 * firstNum / secondNum));

    }
}
