import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/17/2019
 * on 3:06 PM
 * Project-2_SelectionSort
 */

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack myStack = new Stack(null);

        int size;
        int element;

        System.out.println("How many numbers will stack contain?");
        size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter the " + i + ". element: ");
            element = scanner.nextInt();
            Node myNode = new Node(element);
            myStack.push(myNode);
        }

        System.out.println(myStack.getSize());

    }
}
