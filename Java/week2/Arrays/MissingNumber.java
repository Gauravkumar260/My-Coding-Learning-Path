// File = MissingNumber.java

import java.util.Scanner;

public class MissingNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        int sum = 0;

        System.out.println("Enter elemaent of array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int expectedsum= (n+1)*(n+2)/2;

        int missing = expectedsum - sum;

        System.out.println("missing number: "+missing);

        sc.close();

        
    }
}