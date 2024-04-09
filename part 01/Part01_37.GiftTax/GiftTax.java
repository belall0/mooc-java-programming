
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(myScanner.nextLine());

        double taxAmount = 0;

        if (5000 <= giftValue && giftValue <= 25000) {
            taxAmount = 100 + (giftValue - 5000) * 0.08;
        } else if (25000 <= giftValue && giftValue <= 55000) {
            taxAmount = 1700 + (giftValue - 25000) * 0.10;
        } else if (55000 <= giftValue && giftValue <= 200000) {
            taxAmount = 4700 + (giftValue - 55000) * 0.12;
        } else if (200000 <= giftValue && giftValue <= 1000000) {
            taxAmount = 22100 + (giftValue - 200000) * 0.15;
        } else if (giftValue >= 1000000) {
            // giftAmount >= 1000,000
            taxAmount = 142100 + (giftValue - 1000000) * 0.17;
        }

        // print the result
        if (taxAmount == 0) {
            System.out.println("No tax!");
        } else {

            System.out.println(taxAmount);
        }

    }
}
