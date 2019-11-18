/**
 * @author UGURINAL
 * on 11/17/2019
 * on 3:09 PM
 * Project-2_SelectionSort
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
