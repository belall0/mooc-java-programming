
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] arr) {
        int indx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[indx]) {
                indx = i;
            }
        }

        return indx;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndx) {
        int indx = startIndx;
        for (int i = startIndx + 1; i < arr.length; i++) {
            if (arr[i] < arr[indx]) {
                indx = i;
            }
        }

        return indx;

    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = MainProgram.indexOfSmallestFrom(array, i);

            MainProgram.swap(array, i, indexOfSmallest);
        }

    }

}
