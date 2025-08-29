// File = MoveZerostoEnd.java

import java.util.Scanner;
import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to end: ");
        System.out.println(Arrays.toString(arr));

        sc.close();
        
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0; // pointer for next non-zero element

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}

