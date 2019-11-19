import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/19/2019
 * on 4:35 PM
 * Project-4_KMP_Algorithm
 */

public class Main {
    public static char[] subString(char[] text, int a, int b) {

        char[] subText = new char[b - a];

        for (int i = 0; i < b - a + 2; i++) {
            subText[i] = text[a];
            a++;
        }

        return subText;
    }

    public static boolean compare(char[] bText, char[] temp) {
        int size = bText.length;

        for (int i = 0; i < size; i++) {
            if (bText[i] != temp[i]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] aText = scanner.nextLine().toCharArray();
        char[] bText = scanner.nextLine().toCharArray();  // to be searched

        int m = aText.length; // size of text A
        int n = bText.length; // size of text B

        char[] temp;
        int[] indexes = new int[0];
        int iSize = 0;

        for (int i = 0; i < m - n; i++) {
            temp = subString(aText, i, i + n);
            if (compare(bText, temp)) {
                indexes = new int[iSize + 1];
                indexes[iSize] = i;
                iSize++;
            }
        }

        for(int i = 0; i < indexes.length;i++){
            System.out.println(indexes[i] + " ");
        }

    }
}
