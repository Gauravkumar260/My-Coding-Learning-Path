// File = ArrayReverse.java

import java.util.Scanner;

public class ArrayReverse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" element of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("original array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        int left=0,right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.print("\nReversed array: ");
        for(int num:arr){
            System.out.print(num+ " ");
        }
        sc.close();
    }
}