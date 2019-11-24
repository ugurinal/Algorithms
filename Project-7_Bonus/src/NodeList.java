/**
 * @author UGURINAL
 * on 11/24/2019
 * at 12:22 AM
 * Project-7_Bonus
 */

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse();
}
