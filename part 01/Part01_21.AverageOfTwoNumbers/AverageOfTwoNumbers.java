
import java.util.Scanner;

public class AverageOfTwoNumbers {

     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // read the first line
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(myScanner.nextLine());

        // read the second line
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(myScanner.nextLine());

        //
        double avg = ((double) firstNum + secondNum) / 2;
        System.out.println("The average is " + avg);

    }
}
