// File : SumOfNumbers.java
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum of number from 1 to "+n+" is "+sum);
        sc.close();
    }
}
