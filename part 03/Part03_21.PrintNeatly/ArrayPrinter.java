
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here

        boolean firstItem = true;
        for (int i = 0; i < array.length; i++) {
            if (!firstItem) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
            firstItem = false;

        }
    }
}
