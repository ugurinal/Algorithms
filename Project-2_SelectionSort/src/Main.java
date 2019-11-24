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

        int element;
        int choice;

        while (true) {
            System.out.print("1 - Add element to the stack" +
                    "\n2 - Iterative selection sort" +
                    "\n3 - Recursive selection sort" +
                    "\n4 - Display" +
                    "\n5 - Exit" +
                    "\nEnter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number to add the stack");
                    element = scanner.nextInt();
                    Node myNode = new Node(element);
                    if(myStack.push(myNode)){
                        System.out.println(element + " was added to the stack succesfully\n");
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    myStack.iterativeSort();
                    System.out.println("Stack succuessfully sorted");
                    break;
                case 3:
                    myStack.recursiveSort(myStack.getStackPointer());
                    System.out.println("Stack succuessfully sorted");
                    break;
                case 4:
                    myStack.traverse();
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
