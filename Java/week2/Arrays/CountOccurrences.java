// File = CountOccurrences.java

import java.util.Scanner;

public class CountOccurrences{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    int[] arr = {1,2,5,5,4,7,5,4,3};
    System.out.print("Enter element to found: ");
    int target = sc.nextInt();

    int count = 0;

    for (int num:arr){
        if(num==target){
            count++;
        }
    }

    System.out.println("Element "+target+" appears "+count+" times");

    sc.close();

    }
    

}