// File : SortArrayAscending.java
import java.util.Arrays;

public class SortArrayAscending{
    public static void main(String[]args){
        int[] arr ={5,2,6,3,9};

        Arrays.sort(arr);  // Built-in sort

        System.out.println("Sorted array in ascending order: ");
        for(int num : arr){
            System.out.print(num+" ");
            

        }
 

    }
}
