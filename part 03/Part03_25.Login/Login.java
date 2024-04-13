
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize variables and data
        String[] userNames = new String[2];
        String[] passwords = new String[2];

        userNames[0] = "alex";
        passwords[0] = "sunshine";

        userNames[1] = "emma";
        passwords[1] = "haskell";

        // get user inputs
        System.out.println("Enter username: ");
        String usrName = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        // loop over our data to check if this user exists or not
        boolean isExist = false;

        for (int i = 0; i < userNames.length; i++) {
            if (usrName.equals(userNames[i]) && password.equals(passwords[i])) {
                // so this is a real user
                isExist = true;
                break;
            }
        }

        if (isExist) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
