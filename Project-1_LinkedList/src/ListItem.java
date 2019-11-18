import java.util.List;

/**
 * @author UGURINAL
 * on 10/17/2019
 * at 12:22 AM
 * AbstractClassesChallenge
 */

public abstract class ListItem {
    protected ListItem nextItem = null;
    protected ListItem previousItem = null;
    protected int value;

    public ListItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);
}
