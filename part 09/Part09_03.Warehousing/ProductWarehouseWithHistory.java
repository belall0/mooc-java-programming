
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();

        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);

        this.history.add(super.getBalance());

    }

    public double takeFromWarehouse(double amount) {
        double val = super.takeFromWarehouse(amount);

        this.history.add(super.getBalance());
        return val;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history);
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }

    public String history() {
        return this.history.toString();
    }
}
