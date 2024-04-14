
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);

    }
}
