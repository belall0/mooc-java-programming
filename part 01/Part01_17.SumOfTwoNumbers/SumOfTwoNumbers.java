
import java.util.Scanner;

public class SumOfTwoNumbers {

     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // read the first line
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(myScanner.nextLine());

        // read the second line
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(myScanner.nextLine());

        // print the sum of them
        System.out.println("The sum of the numbers is " + (firstNum + secondNum));

    }
}
