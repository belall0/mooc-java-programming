
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grades = new Grade();
        UserInterface ui = new UserInterface(scanner, grades);

        ui.readPoints();

        ui.printAverage();
        ui.printAverageOfPassingGrades();
        ui.printPassPercentage();
        ui.printGradeDistribution();

        scanner.close();
    }
}
