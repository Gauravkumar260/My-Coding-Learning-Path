// File = KadaneAlgorithm.java

import java.util.Scanner;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            // Either extend current subarray OR start new from arr[i]
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println("Maximum Subarray Sum = " + maxSoFar);

        sc.close();
    }
}
