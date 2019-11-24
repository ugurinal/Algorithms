import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/23/2019
 * at 11:54 PM
 * Project-7_Bonus
 */

public class Main {

    public static void combine(MyLinkedList list) {
        ListItem head = list.getRoot();
        ListItem temp;

        ListItem headDel;       // to save head's previous address
        ListItem tempDel;       // to save temp's previous address

        while (head != null) {
            temp = head.next();

            while (temp != null) {
                if (head.getTaban() == temp.getTaban() && head.getUs() == temp.getUs()) {
                    int newKatsayi = head.getKatSayi() + temp.getKatSayi();
                    int newTaban = head.getTaban();
                    int newUs = head.getUs();

                    list.addItem(new Node(newKatsayi, newTaban, newUs));

                    if (head.next() == temp) {
                        headDel = head;
                        tempDel = temp;
                        head = temp.next();
                        temp = head.next();
                        list.removeItem(headDel);
                        list.removeItem(tempDel);
                    } else {
                        headDel = head;
                        tempDel = temp;

                        head = head.next();
                        temp = temp.next();
                        list.removeItem(headDel);
                        list.removeItem(tempDel);
                    }


                } else {
                    temp = temp.next();
                }
            }
            head = head.next();

        }

    }

    public static void sum(MyLinkedList list) {
        System.out.print("\n\nTotal of list = ");
        int sum;
        int total = 0;
        ListItem temp = list.getRoot();
        list.traverse();
        System.out.print("\n= ");
        while (temp != null) {
            sum = temp.getKatSayi() * ((int) Math.pow(temp.getTaban(), temp.getUs()));
            total += sum;
            System.out.print(sum);
            if (temp.next() != null) {
                System.out.print(" + ");
            }
            temp = temp.next();
        }
        System.out.print(" = " + total);
    }

    public static void main(String[] args) throws IOException {

        MyLinkedList myList = new MyLinkedList(null);

        FileReader fileReader = new FileReader("data.txt");
        Scanner scanner = new Scanner(new BufferedReader(fileReader));

        scanner.useDelimiter(" ");

        String taban;
        String katSayi;
        String us;

        /*
        We read all numbers from file as a string then we convert it to integer
         */

        int intTaban;
        int intKatSayi;
        int intUs;


        while (scanner.hasNextLine()) {
            katSayi = scanner.next();
            scanner.skip(scanner.delimiter());
            taban = scanner.next();
            scanner.skip(scanner.delimiter());
            us = scanner.nextLine();

            intTaban = Integer.parseInt(taban);     //Converting to integer
            intKatSayi = Integer.parseInt(katSayi); //Converting to integer
            intUs = Integer.parseInt(us);           //Converting to integer

            myList.addItem(new Node(intKatSayi, intTaban, intUs));

        }

        System.out.println("List before combining process");
        myList.traverse();

        System.out.println("\n");
        System.out.println("List after combining process");

        combine(myList);
        myList.traverse();

        sum(myList);

    }
}
