// File : SortArrayDescending.java
import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending{
    public static void main(String[]args){
        Integer[] arr = {9,3,5,2,7};

        Arrays.sort(arr, Collections.reverseOrder()); // Only works with Integer, not int

        System.out.println("Sorted array in descending order: ");
        for(int num:arr){
            System.out.print(num +" ");
        }
    }
}