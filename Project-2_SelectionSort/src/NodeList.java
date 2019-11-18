/**
 * @author UGURINAL
 * on 11/17/2019
 * on 3:26 PM
 * Project-2_SelectionSort
 */

public interface NodeList {
    ListItem getStackPointer();
    boolean push(ListItem item);
    int pop();
    void iterativeSort();
    void recursiveSort(ListItem stackPointer);
    void traverse();

}
