// File : LinearSearch.java
import java.util.Scanner;

public class LinearSearch{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for ( int i=0; i<= arr.length; i++){
            if (arr[i] == target){
                System.out.println("Found at index: "+i);
                found = true;
                break;

            }
        }
        if (!found){
            System.out.println("Not found in array.");

        }
        sc.close();
    }

}