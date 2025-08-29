// File: TripletSum.java
import java.util.Scanner;

public class TripletSum {
   public static boolean findTriplet(int[] arr, int target) {
    int n = arr.length;
    boolean found = false;

    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                if (arr[i] + arr[j] + arr[k] == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    found = true;
                }
            }
        }
    }

    return found;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Check for triplet
        if (!findTriplet(arr, target)) {
            System.out.println("No triplet found with sum = " + target);
        }

        sc.close();
    }
}
