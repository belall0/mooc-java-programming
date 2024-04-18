
import java.util.ArrayList;

public class Grade {

    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;

    public Grade() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addPoint(int point) {
        // check if the point is in the range of 0 to 100
        if (!(0 <= point && point <= 100)) {
            return;
        }

        points.add(point);
        grades.add(fromPointToGrade(point));
    }

    public double getAverageOfTotalPoints() {
        double sum = 0;

        for (int point : points) {
            sum += point;

        }
        return sum / points.size();
    }

    public double getAverageOfPassingPoints() {
        double sum = 0;
        int cnt = 0;

        for (int point : points) {

            if (point >= 50) {
                sum += point;
                cnt++;
            }

        }

        return (cnt == 0 ? -1 : sum / cnt);

    }

    public double getPassPercentage() {
        double cnt = 0;
        for (int point : points) {

            if (point >= 50) {
                cnt++;
            }

        }

        return 100 * cnt / points.size();
    }

    public int fromPointToGrade(int point) {
        if (point < 50) {
            return 0;
        } else if (point < 60) {
            return 1;
        } else if (point < 70) {
            return 2;
        } else if (point < 80) {
            return 3;
        } else if (point < 90) {
            return 4;
        } else {
            return 5;
        }

    }

    public int gradeCount(int grade) {
        int cnt = 0;
        for (int g : grades) {
            if (g == grade) {
                cnt++;
            }
        }
        return cnt;
    }
}
