/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:39 PM
 * Project-3_BubbleSort
 */

public abstract class ListItem {
    protected ListItem previousItem = null;
    protected ListItem nextItem = null;
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

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem item);

    abstract ListItem next();

    abstract ListItem setNext(ListItem item);

    abstract int compareTo(ListItem item);
}
