
import java.util.Scanner;

public class SecondsInADay {

  public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(myScanner.nextLine());
        int seconds = days* 24 * 60 * 60;

        System.out.println(seconds);
    }
}
