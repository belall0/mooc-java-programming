
public class OneItemBox extends Box {

    private Item item;

    public OneItemBox() {
        this.item = null;

    }

    public void add(Item item) {
        if (this.item == null) {
            this.item = item;
        }

    }

    public boolean isInBox(Item item) {
        if (this.item == null) {
            return false;
        }
        return this.item.getName().equals(item.getName());

    }
}
