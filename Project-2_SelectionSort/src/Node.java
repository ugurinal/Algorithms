/**
 * @author UGURINAL
 * on 11/17/2019
 * on 3:19 PM
 * Project-2_SelectionSort
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
        return this.nextItem;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return Integer.compare(super.getValue(),item.getValue());
        } else {
            return -1;
        }
    }
}
