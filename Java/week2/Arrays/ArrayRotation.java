// File = ArrayRotation.java

import java.util.Scanner;

public class ArrayRotation {
    // Function to rotate left
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle if k > n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Function to rotate right
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Utility function to reverse part of array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter rotation steps (k): ");
        int k = sc.nextInt();

        // Make a copy for left rotation
        int[] leftArray = arr.clone();
        leftRotate(leftArray, k);
        System.out.print("Array after Left Rotation by " + k + ": ");
        printArray(leftArray);

        // Make a copy for right rotation
        int[] rightArray = arr.clone();
        rightRotate(rightArray, k);
        System.out.print("Array after Right Rotation by " + k + ": ");
        printArray(rightArray);

        sc.close();
    }
}
