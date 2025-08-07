// File : AddTwoNumbersFunction.java
import java.util.Scanner;

public class AddTwoNumbersFunction {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        int result = add(x, y);
        System.out.println("sum is: "+result);
        sc.close();
    }
}
