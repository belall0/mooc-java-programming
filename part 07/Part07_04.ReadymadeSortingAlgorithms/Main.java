
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Belal", "Ahmed"};
        Main.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);

    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);

    }
}
