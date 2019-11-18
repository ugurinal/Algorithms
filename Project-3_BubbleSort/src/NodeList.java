/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:41 PM
 * Project-3_BubbleSort
 */

public interface NodeList {
    ListItem getFront();

    ListItem getRear();

    boolean enqueue(ListItem item);

    int dequeue();

    int size();

    void iteBubbleSort();

    void recBubbleSort(ListItem front);

    void traverse();
}
