/**
 * @author UGURINAL
 * on 10/17/2019
 * at 7:04 PM
 * AbstractClassesChallenge
 */

public class Node extends ListItem {

    public Node(int value) {
        super(value);
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
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return Integer.compare(super.getValue(), item.getValue());
        } else {
            return -1;
        }
    }
}
