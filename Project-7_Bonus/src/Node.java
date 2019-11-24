/**
 * @author UGURINAL
 * on 11/24/2019
 * at 12:22 AM
 * Project-7_Bonus
 */

public class Node extends ListItem {

    public Node(int katSayi, int taban, int us) {
        super(katSayi, taban, us);
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

}
