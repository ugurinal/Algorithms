/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:44 PM
 * Project-3_BubbleSort
 */

public class Node extends ListItem {

    public Node(int value) {
        super(value);
    }

    @Override
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousItem = item;
        return previousItem;
    }

    @Override
    ListItem next() {
        return nextItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextItem = item;
        return nextItem;
    }

    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return Integer.compare(super.getValue(), item.getValue());
        }

        return -1;
    }
}
