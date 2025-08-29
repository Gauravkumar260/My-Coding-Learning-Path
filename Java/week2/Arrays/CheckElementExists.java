// File : CheckElementExists.java 
import java.util.Scanner;

public class CheckElementExists{
    public static void main(String[]args){
        int[] arr = {2,3,4,5,6};
         
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int element = sc.nextInt();

        boolean exist = false;

        for (int i=0; i< arr.length; i++){
            if ( arr[i]==element){
                exist = true;
                break;

            }
        }
        if(exist){
            System.out.println("Element "+element+" exist in the array.");
        }else{
            System.out.println("element "+element+" not found. ");

        }
        sc.close();

    }
}