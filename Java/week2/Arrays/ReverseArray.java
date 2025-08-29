// File : ReverseArray.java

public class ReverseArray{
    public static void main(String[]args){
        int[] num = {1,2,3,4,5};

        System.out.println("Original array: ");
        for(int i= 0; i< num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("\nReversed array: ");
        for (int i= num.length-1; i>=0; i--){
            System.out.print(num[i] +" ");
        }

    }
    
}