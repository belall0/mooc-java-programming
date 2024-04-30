
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        String result = "";
        for (int row = 0; row < array.length; row++) {
            String rowStr = "";
            for (int col = 0; col < array[row].length; col++) {
                rowStr += array[row][col];
            }
            result += rowStr + "\n";
        }

        return result;
    }
}
