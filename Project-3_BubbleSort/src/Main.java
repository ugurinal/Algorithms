/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:35 PM
 * Project-3_BubbleSort
 */

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(null, null);

        Node test = new Node(0);
        Node test1 = new Node(1234);
        Node test2 = new Node(-164);
        Node test3 = new Node(12);
        Node test4 = new Node(789);
        Node test5 = new Node(55);
        Node test6 = new Node(64);

        myQueue.enqueue(test);
        myQueue.enqueue(test1);
        myQueue.enqueue(test2);
        myQueue.enqueue(test3);
        myQueue.enqueue(test4);
        myQueue.enqueue(test5);
        myQueue.enqueue(test6);

//        myQueue.iteBubbleSort();
        myQueue.recTest(myQueue.getFront());
        myQueue.traverse();
    }
}
