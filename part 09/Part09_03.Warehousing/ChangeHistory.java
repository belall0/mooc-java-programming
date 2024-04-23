
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (history.size() == 0) {
            return 0;
        }

        // get the maximum value
        double max = history.get(0);
        for (double value : history) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public double minValue() {
        if (history.size() == 0) {
            return 0;
        }

        // get the minimum value
        double min = history.get(0);
        for (double value : history) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public double average() {
        if (history.size() == 0) {
            return 0;
        }

        // get the average value
        double sum = 0;
        for (double value : history) {
            sum += value;
        }

        return sum / history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
