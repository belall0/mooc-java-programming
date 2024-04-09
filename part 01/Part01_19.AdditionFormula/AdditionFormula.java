
import java.util.Scanner;

public class AdditionFormula {

     public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // read the first line
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(myScanner.nextLine());

        // read the second line
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(myScanner.nextLine());

        // print
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));

    }
}
