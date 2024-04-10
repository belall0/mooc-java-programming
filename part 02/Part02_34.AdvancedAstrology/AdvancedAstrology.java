
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {

            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        int base = height * 2 - 1;

        // print the tree
        for (int i = 1; i <= height; i++) {
            int numOfStarts = 2 * i - 1;
            int numOfSpaces = (base - numOfStarts) / 2;

            printSpaces(numOfSpaces);
            printStars(numOfStarts);
        }

        int baseSpaces = (base - 3) / 2;

        for (int i = 1; i <= 2; i++) {

            printSpaces(baseSpaces);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
