/**
 * @author UGURINAL
 * on 10/17/2019
 * at 7:21 PM
 * AbstractClassesChallenge
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
    public boolean addItemInOrder(ListItem item) {
        if (root == null) {
            // the list was empty, so the item becomes the root of the list
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        int compare = 0;
        while (currentItem != null) {
            compare = currentItem.compareTo(item);
            if (compare < 0) {
                // New item is greater than currentItem, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, insert the new item at the end of the list
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if (compare > 0) {
                // new item is less than currentItem, move left if possible
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                } else {
                    // there is no previous, the new item will be the root
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                // equal
                System.out.println(item.getValue() + " is already on present, not added.");
                return false;
            }
        }
        return false;
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
        item.setPrevious(temp);
        temp.setNext(item);
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item == null) {
            System.out.println("Invalid value. Please enter a valid number.");
            return false;
        }

        if (this.root == null) {
            System.out.println("The list is empty. You can not apply remove function.");
            return false;
        }

        ListItem temp = this.root;
        int compare;
        while (temp != null) {
            compare = temp.compareTo(item);
            if (compare == 0) {
                //
                if (temp == this.root) {
                    // Item is found at the beginning of the list
                    this.root = this.root.next();
                } else {
                    // Item is found in the middle of the list
                    temp.previous().setNext(temp.next());
                    if (temp.next() != null) {
                        //Item is not at the and of the list if it is then this code will not be executed
                        temp.next().setPrevious(temp.previous());
                    }
                }
                return true;
            } else {
                temp = temp.next();
            }
        }
        System.out.println(item.getValue() + " is not already in the list.");
        return false;
    }

    // method to print all the elements in the list
    @Override
    public void traverse() {
        if (this.root == null) {
            System.out.println("The list is empty.");
        } else {
            while (this.root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

    @Override
    public boolean iterativeLinearSearch(int searchKey) {
        ListItem temp = this.root;

        if (temp == null) {
            System.out.println("The list is empty.");
            return false;
        }

        while (temp != null) {
            if (temp.getValue() == searchKey) {
                temp = this.root;
                System.out.println("The positive divisors of numbers in the list:");
                while (temp != null) {
                    int value = temp.getValue();
                    System.out.print("The positive divisors of " + value + " are -->   ");
                    for (int i = 1; i < value; i++) {
                        if (value % i == 0) {
                            System.out.print(i + "  ");
                        }
                    }
                    System.out.println();
                    temp = temp.next();
                }
                return true;
            } else {
                temp = temp.next();
            }

        }
        System.out.println(searchKey + " is not in the list.");
        return false;
    }

    @Override
    public boolean recLinearSearch(ListItem root, int searchKey) {

        if (root == null) {
            System.out.println(searchKey + " is not in the list!!!");
            return false;
        }

        if (root.getValue() == searchKey) {
            ListItem temp = this.root;
            System.out.println("The positive divisors of numbers in the list:");
            while (temp != null) {
                int value = temp.getValue();
                System.out.print("The divisors of " + value + " are  --->   ");
                for (int i = 1; i <= value; i++) {
                    if (value % i == 0) {
                        System.out.print(i + "  ");
                    }
                }
                System.out.println();
                temp = temp.next();
            }
            return true;
        }

        return recLinearSearch(root.next(), searchKey);
    }
}