// File : PalindromeNumber.java
import java.util.Scanner;

public class PalindromeNumber{

    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse*10+digit;
            n/=10;

        }
        return original == reverse;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num+" is a Palindrome");
        }else{
            System.out.println(num+" is not a Palindrome");

        }
        sc.close();
    }
}