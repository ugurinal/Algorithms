import java.util.Scanner;

/**
 * @author UGURINAL
 * on 11/21/2019
 * on 3:10 PM
 * Project-4_KMP
 */

public class Main {

    private static int[] resizeArray(int[] oldArray, int newSize) {
        int oldSize = oldArray.length;
        int[] newArray = new int[newSize];

        for (int i = 0; i < oldSize; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public static int[] findLps(int[] pattern, int m) {

        int[] lps = new int[m];
        lps[0] = 0;
        int i = 1;
        int len = 0;

        while (i < m) {
            if (pattern[i] == pattern[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {        // if len = 0
                    lps[i] = len;
                    i++;
                }
            }
        }
        return lps;
    }

    public static int[] kmp(int[] text, int[] pattern) {
        int n = text.length;
        int m = pattern.length;
        int[] matches = new int[0];

        int[] lps = findLps(pattern, m);

        int pIndex = 0; // index for pattern[]
        int tIndex = 0; // index for text[]
        int mIndex = 0; // index for matches[]

        while (tIndex < n) {
            if (text[tIndex] == pattern[pIndex]) {
                tIndex++;
                pIndex++;
            }

            if (pIndex == m) {
                matches = resizeArray(matches, mIndex + 1);
                matches[mIndex] = tIndex - pIndex;
                mIndex++;
                pIndex = lps[pIndex - 1];
            } else if (tIndex < n && text[tIndex] != pattern[pIndex]) {
                if (pIndex != 0) {
                    pIndex = lps[pIndex - 1];
                } else {
                    tIndex++;
                }
            }
        }


        return matches;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;

        System.out.print("Enter the size of text : ");
        n = scanner.nextInt();

        System.out.print("Enter the size of pattern : ");
        m = scanner.nextInt();
        System.out.println();

        int[] text = new int[n];
        int[] pattern = new int[m];
        int[] index;        // to save positions

        for(int i = 0;i < n;i++){
            text[i] = (int)(Math.random() * (i * 100)) % 2;
        }

        for(int i = 0;i < m;i++){
            pattern[i] = (int)(Math.random() * (i * 100)) % 2;
        }

        index = kmp(text,pattern);

        System.out.print("Text : ");
        for(int t : text){
            System.out.print(t);
        }

        System.out.print("\nPattern : ");
        for(int p : pattern){
            System.out.print(p);
        }

        System.out.print("\n\nPattern found at : ");

        for(int i = 0; i < index.length;i++){
            System.out.print(index[i]);
            if(i != index.length -1){
                System.out.print(", ");
            }
        }

    }
}
