import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/18/2019
 * on 6:35 PM
 * Project-3_BubbleSort
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue myQueue = new Queue(null, null);

        int element;
        int choice;

        while (true) {
            System.out.print("1 - Add element to the queue" +
                    "\n2 - Iterative bubble sort" +
                    "\n3 - Recursive bubble sort" +
                    "\n4 - Display" +
                    "\n5 - Exit" +
                    "\nEnter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number to add the Queue");
                    element = scanner.nextInt();
                    Node myNode = new Node(element);
                    if (myQueue.enqueue(myNode)) {
                        System.out.println(element + " was added to the Queue succesfully\n");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    myQueue.iteBubbleSort();
                    System.out.println("Queue succuessfully sorted");
                    break;
                case 3:
                    myQueue.recBubbleSort(myQueue.getFront());
                    System.out.println("Queue succuessfully sorted");
                    break;
                case 4:
                    myQueue.traverse();
                    break;
                case 5:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;

            }
        }
    }
}
