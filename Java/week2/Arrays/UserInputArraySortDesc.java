// File : UserInputArraySortDesc.java

import java.util.Scanner;

public class UserInputArraySortDesc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" element: ");
        for (int i=0; i< size; i++){
        arr[i] = sc.nextInt();
        }
        // bubble shot - descending
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.println("Sorted  in descending: ");
        for (int num :arr ){
        System.out.print(num+" ");
        
        }
        sc.close();

    }
}