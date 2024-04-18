
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Grade grades;

    public UserInterface(Scanner scanner, Grade grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());

            if (grade == -1) {
                break;
            }

            grades.addPoint(grade);
        }

    }

    public void printAverage() {
        System.out.println("Point average (all): " + grades.getAverageOfTotalPoints());
    }

    public void printAverageOfPassingGrades() {
        double avg = grades.getAverageOfPassingPoints();

        System.out.println("Point average (passing): " + (avg == -1 ? "-" : avg));
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + grades.getPassPercentage());
    }

    public void printGradeDistribution() {
        System.out.println("Grade distribution: ");
        int grade = 5;

        while (grade >= 0) {
            int stars = grades.gradeCount(grade);
            System.out.print(grade + ": ");

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            grade--;
            System.out.println();
        }
    }
}
