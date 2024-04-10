
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String usrInput = myScanner.nextLine();

            if (usrInput.equals("no")) {
                break;
            }

        }

    }
}
