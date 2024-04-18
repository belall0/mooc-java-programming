
public class Container {

    private int value;

    public Container() {
        this.value = 0;
    }

    public int contains() {
        return this.value;
    }

    public void add(int amount) {

        if (amount < 0) {
            return;
        }

        this.value = (this.value + amount > 100 ? 100 : this.value + amount);
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.value = (this.value - amount < 0 ? 0 : this.value - amount);
    }

    public String toString() {
        return this.value + "/100";
    }

}
