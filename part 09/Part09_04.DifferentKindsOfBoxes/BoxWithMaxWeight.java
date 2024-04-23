
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {

        if (item.getWeight() + getCurrentWeight() <= this.maxWeight) {
            items.add(item);
        }

    }

    private int getCurrentWeight() {
        int curr = 0;
        for (Item i : items) {
            curr += i.getWeight();
        }
        return curr;
    }

    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
