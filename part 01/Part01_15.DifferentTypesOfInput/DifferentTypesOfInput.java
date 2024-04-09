
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // reading string
        System.out.println("Give a string:");
        String usrStr = myScanner.nextLine();

        // reading integer
        System.out.println("Give an integer:");
        int usrInt = Integer.valueOf(myScanner.nextLine());

        // reading double
        System.out.println("Give a double:");
        double usrDouble = Double.valueOf(myScanner.nextLine());

        // reading boolean
        System.out.println("Give a boolean:");
        boolean usrBoolean = Boolean.valueOf(myScanner.nextLine());

        // print the results
        System.out.println("You gave the string " + usrStr);
        System.out.println("You gave the integer " + usrInt);
        System.out.println("You gave the double " + usrDouble);
        System.out.println("You gave the boolean " + usrBoolean);

    }
}
