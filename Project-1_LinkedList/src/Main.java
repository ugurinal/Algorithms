import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/16/2019
 * on 6:55 PM
 * Project-1_LinkedList
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyLinkedList test = new MyLinkedList(null);

        int size;
        int element;
        int searchKey;

        System.out.println("How many numbers will linked list contain?");
        size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter the " + i + ". element: ");
            element = scanner.nextInt();
            Node myNode = new Node(element);
            test.addItem(myNode);
        }

        System.out.println("Enter the number to be searched: ");
        searchKey = scanner.nextInt();

        test.recLinearSearch(test.getRoot(), searchKey);
    }
}
