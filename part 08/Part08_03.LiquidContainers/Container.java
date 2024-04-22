public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public void add(int amount) {
        this.amount = (this.amount + amount < 100 ? this.amount + amount : 100);
    }

    public void remove(int amount) {
        this.amount = (this.amount - amount > 0 ? this.amount - amount : 0);
    }

    public int getAmount() {
        return this.amount;
    }

    public String toString() {
        return this.amount + "/100";
    }

}
