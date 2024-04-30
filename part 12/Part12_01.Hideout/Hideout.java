
public class Hideout<T> {

    private T var;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        if (this.var == toHide) {
            this.var = null;
        } else {
            this.var = toHide;
        }
    }

    public T takeFromHideout() {
        T temp = this.var;
        this.var = null;
        return temp;
    }

    public boolean isInHideout() {
        return this.var == null ? false : true;
    }
}
