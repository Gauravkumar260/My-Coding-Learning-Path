// File : ArrayDeclaration.java

public class ArrayDeclaration{

    public static void main(String[]args){
        int[] mark = {90,80,70,60,50};

        System.out.println("First mark"+mark[0]);
        System.out.println("Last mark"+mark[mark.length - 1]);
        System.out.println("Total subjects"+ mark.length);
    }


}