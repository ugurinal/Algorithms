/**
 * @author UGURINAL
 * on 10/17/2019
 * at 7:19 PM
 * AbstractClassesChallenge
 */

public interface NodeList {
    ListItem getRoot();
    boolean addItemInOrder(ListItem item);
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse();
    boolean iterativeLinearSearch(int searchKey);
    boolean recLinearSearch(ListItem root, int searchKey);
}
