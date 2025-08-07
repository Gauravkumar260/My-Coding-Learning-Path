// File : FindMaxFunction.java
import java.util.Scanner;

public class FindMaxFunction{

    public static int FindMax(int a,int b,int c){
        int max =a;
        if(b>max) max=b;
        if(c>max) max=c;
        return max;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("maximum is: "+ FindMax(x,y,z));

        sc.close();
    }
}