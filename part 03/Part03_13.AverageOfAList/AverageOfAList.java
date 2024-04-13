
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                break;
            }

            list.add(num);
        }

        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }

        System.out.println("Average: " + (double) sum / list.size());

    }
}
