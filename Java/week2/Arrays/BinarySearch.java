// File :  BinarySearch.java

import java.util.Scanner;

public class  BinarySearch{
    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;


    }
    public static void main(String[] args){

        Scanner sc = new  Scanner(System.in);

        int[] arr= {1,5,23,73,7};
        System.out.print("Enter element to search: ");

        int target = sc.nextInt();

        int result =  BinarySearch(arr, target);

        if(result == -1){
            System.out.println("Element nnot found.");
        }else{
            System.out.println("Element found at index: " + result);
        }
        sc.close();


    }

}