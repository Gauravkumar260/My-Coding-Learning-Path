// File = PalindromeCheck.java

public class PalindromeCheck{
    public static void main(String[]args){
        int[] arr ={1,2,4,5,4,2,1};
    Boolean isPalindrome = true;

    for (int i=0; i<arr.length/2; i++){
        if(arr[i]!=arr[arr.length-1-i]){
            isPalindrome = false;
            break;
        }

    }
    if(isPalindrome){
        System.out.println("Array is a Palindrome.");
    }else{
        System.out.println("Array is not a Palindrome.");

    }
    }
}