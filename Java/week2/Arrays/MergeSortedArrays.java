// File = MergeSortedArrays.java
 
import java.util.Scanner;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array (sorted): ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array (sorted): ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = mergeArrays(arr1, arr2);

        System.out.println("Merged sorted array: ");
        System.out.println(Arrays.toString(merged));

        sc.close();
    }

    public static int[] mergeArrays(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) merged[k++] = a[i++];
        while (j < n2) merged[k++] = b[j++];

        return merged;
    }
}
