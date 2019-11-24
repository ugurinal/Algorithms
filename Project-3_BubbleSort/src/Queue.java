/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:47 PM
 * Project-3_BubbleSort
 */

public class Queue implements NodeList {
    private ListItem front = null;
    private ListItem rear = null;
    private int size;

    public Queue(ListItem front, ListItem rear) {
        this.front = front;
        this.rear = rear;
        this.size = 0;
    }

    @Override
    public ListItem getFront() {
        return this.front;
    }

    @Override
    public ListItem getRear() {
        return this.rear;
    }

    @Override
    public boolean enqueue(ListItem item) {
        if (item == null) {
            return false;
        }

        ListItem temp;  // saves rear's current adress to set previous

        if (front == null) {
            front = item;
            rear = item;
            size++;
        } else {
            temp = rear;
            rear.setNext(item);
            rear = item;
            rear.setPrevious(temp);
            size++;
        }
        return true;
    }

    @Override
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int x = front.getValue();
        front.setPrevious(null);
        front = front.next();

        // if front becomes null, change rear to null too. because there will be no element in the queue
        if (front == null) {
            rear = null;
        }

        System.out.println(x + " dequeued from queue list.");
        size--;
        return x;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void iteBubbleSort() {

        ListItem temp = front;
        ListItem temp2;

        while (temp != null) {

            temp2 = front;

            while (temp2.next() != null) {
                if (temp2.getValue() > temp2.next().getValue()) {
                    int x = temp2.next().getValue();
                    temp2.next().setValue(temp2.getValue());
                    temp2.setValue(x);
                }
                temp2 = temp2.next();
            }
            temp = temp.next();
        }

    }

    @Override
    public void recBubbleSort(ListItem front) {

        if (front == null) {
            return;
        }

        ListItem temp = this.front;

        while (temp.next() != null) {
            if (temp.getValue() > temp.next().getValue()) {
                int x = temp.next().getValue();
                temp.next().setValue(temp.getValue());
                temp.setValue(x);
            } else {
                temp = temp.next();
            }
        }
        recBubbleSort(front.next());

    }

    @Override
    public void traverse() {

        if (this.front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        ListItem temp = this.front;
        while (temp != null) {
            System.out.print(temp.getValue());
            if (temp.next() != null) {
                System.out.print(" -> ");
            }
            temp = temp.next();
        }
        System.out.println();

    }

}

