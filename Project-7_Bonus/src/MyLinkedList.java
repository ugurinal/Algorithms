/**
 * @author UGURINAL
 * on 11/24/2019
 * at 12:22 AM
 * Project-7_Bonus
 */

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            // the list is empty
            this.root = item;
            return true;
        }

        ListItem temp = root;

        while (temp.next() != null) {
            // list is not empty, go at the end of the list
            temp = temp.next();
        }
        // we reached at the end of the list, add new item to the list
        temp.setNext(item);
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root == null) {
            System.out.println("List is empty.");
            return false;
        }

        ListItem head = root;
        ListItem temp = root.next();

        if (head.taban == item.taban && head.us == item.us && head.katSayi == item.katSayi) {
            this.root = root.next();
            return true;
        } else {
            while (temp != null) {
                if (temp.taban == item.taban && temp.us == item.us && temp.katSayi == item.katSayi) {
                    head.setNext(temp.next());
                    return true;
                } else {
                    temp = temp.next();
                    head = head.next();
                }
            }

            return true;

        }
    }

    @Override
    public void traverse() {
        ListItem temp = root;
        if (root == null) {
            System.out.println("List is empty.");
        }
        while (temp != null) {
            System.out.print(temp.getKatSayi() + "x" + temp.getTaban() + "^" + temp.getUs());
            if (temp.next() != null) {
                System.out.print(" + ");
            }
            temp = temp.next();
        }
    }

}