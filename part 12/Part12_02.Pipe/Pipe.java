
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    List<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {

        if (this.values.size() == 0) {
            return null;
        }

        T val = values.get(0);
        this.values.remove(0);

        return val;

    }

    public boolean isInPipe() {
        return !this.values.isEmpty();
    }
}
