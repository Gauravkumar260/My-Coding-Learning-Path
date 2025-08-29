// File : MenuCalculatorLoop.java
import java.util.Scanner;

public class MenuCalculatorLoop{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\n=== Calculator menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("choose option: ");
            
            int choice = sc.nextInt();

            if (choice ==5 ){
                System.out.println("Exiting Calculator.....");
                running = false;
                continue;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice){
                case 1:
                System.out.println("result:"+ (a+b));
                break;
                case 2:
                System.out.println("result:"+ (a-b));
                break;
                case 3:
                System.out.println("result:"+ (a*b));
                break;
                case 4:
                    if (b==0){
                System.out.println("Cannot divide by zero!");
                    }else{
                System.out.println("result:"+ (a/b));
                    }
                break;
                default:
                    System.out.println("Invalid choice");

                    sc.close();


            }
        }
    }
}