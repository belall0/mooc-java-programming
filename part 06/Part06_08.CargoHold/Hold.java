
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase i : suitcases) {
            total += i.totalWeight();
        }

        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight < this.totalWeight() + suitcase.totalWeight()) {
            return;
        }

        suitcases.add(suitcase);
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase i : suitcases) {
            i.printItems();
        }
    }
}
