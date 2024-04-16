
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        // get the last element in the stack
        String returnValue = this.stack.get(stack.size() - 1);

        // remove the last element
        this.stack.remove(stack.size() - 1);

        return returnValue;

    }
}
