// File :  CalculatorWithFunctions.java
import java.util.Scanner;

public class CalculatorWithFunctions {

    public static double  add(double a, double b){
        return a+b;
    }
    public static double  subtract(double a, double b){
        return a-b;
    }
    public static double  multiply(double a, double b){
        return a*b;
    }
    public static double  divide(double a, double b){
        if (b==0){
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a/b;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x= sc.nextDouble();
        System.out.print("Enter second number: ");
        double y= sc.nextDouble();
        System.out.println("choose operation (+,-,*,/): ");
        char op = sc.next().charAt(0);

        double result =0;

        switch(op){
            case '+': result= add(x,y); break;
            case '-': result= subtract(x,y); break;
            case '*': result= multiply(x,y); break;
            case '/': result= divide(x,y); break;
            default: System.out.println("Invalid operation");

    }
    System.out.println("result = " + result);

    sc.close();

}
}