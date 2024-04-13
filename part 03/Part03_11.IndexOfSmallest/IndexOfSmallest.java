
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 9999) {
                break;
            }

            arr.add(number);
        }

        int smallest = arr.get(0);
        ArrayList<Integer> indx = new ArrayList<>();
        indx.add(0);

        for (int i = 1; i < arr.size(); i++) {
            if (smallest > arr.get(i)) {
                smallest = arr.get(i);

                indx.clear();
                indx.add(i);
            } else if (smallest == arr.get(i)) {
                indx.add(i);
            }
        }
        System.out.println("Smallest number: " + smallest);

        // print
        for (int i = 0; i < indx.size(); i++) {

            System.out.println("Found at index: " + indx.get(i));

        }

    }
}
