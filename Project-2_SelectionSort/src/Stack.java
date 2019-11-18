/**
 * @author UGURINAL
 * on 11/17/2019
 * on 3:32 PM
 * Project-2_SelectionSort
 */

public class Stack implements NodeList {

    private ListItem stackPointer = null;
    private int size = 0;

    public Stack(ListItem stackPointer) {
        this.stackPointer = stackPointer;
    }

    @Override
    public ListItem getStackPointer() {
        return this.stackPointer;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean push(ListItem item) {
        if (item == null) {
            System.out.println("Please enter a valid number.");
            return false;
        }

        // if stack is empty, new item will be the stackpointer
        if (this.stackPointer == null) {
            this.stackPointer = item;
            size++;
            return true;
        } else {
            // The new item will be added to the beginning of the list since the stack pointer must show the last inserted node
            stackPointer.setPrevious(item);
            item.setNext(stackPointer);
            stackPointer = item;
            size++;
            return true;
        }
    }

    @Override
    public int pop() {
        if (this.stackPointer == null) {
            System.out.println("The list is empty.");
            return -1;
        }

        int value = stackPointer.getValue();

        if (stackPointer.previous() != null) {
            stackPointer.setPrevious(null);
        }

        stackPointer = stackPointer.next();

        System.out.println(value + " popped out.");
        size--;
        return value;

    }

    @Override
    public void iterativeSort() {
        ListItem temp = stackPointer;
        ListItem findMin;
        ListItem min;

        while (temp != null) {
            min = temp;
            findMin = temp.next();
            // find the minimum value in the stack
            while (findMin != null) {
                if (findMin.getValue() < min.getValue()) {
                    min = findMin;
                }
                findMin = findMin.next();
            }
            // swap the values
            int x = min.value;
            min.setValue(temp.getValue());
            temp.setValue(x);
            temp = temp.next();
        }
    }

    @Override
    public void recursiveSort(ListItem stackPointer) {
        if (stackPointer == null) {
            return;
        }

        ListItem temp = stackPointer;
        ListItem min = stackPointer;

        while (temp != null) {
            if (temp.getValue() < min.getValue()) {
                min = temp;
            } else {
                temp = temp.next();
            }
        }

        int x = min.getValue();
        min.setValue(stackPointer.getValue());
        stackPointer.setValue(x);

        recursiveSort(stackPointer.next());

    }

    @Override
    public void traverse() {

        if (this.stackPointer == null) {
            return;
        }

        ListItem temp = this.stackPointer;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.next();
        }

    }
}
