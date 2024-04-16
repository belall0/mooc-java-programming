
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String elements = "";
        for (String element : this.elements) {
            elements += element + "\n";
        }

        elements = elements.substring(0, elements.length() - 1);

        return "The collection " + this.name + " has " + this.elements.size()
                + (this.elements.size() > 1 ? " elements:" : " element:") + "\n" + elements;
    }

}
