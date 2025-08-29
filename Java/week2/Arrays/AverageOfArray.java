// File : AverageOfArray.java

public class AverageOfArray{
    public static void main (String[]args){
        int[] num ={1,2,3,4,5};
        int sum = 0;

        for (int i=0;  i< num.length; i++){
            sum += num[i];
        }
        double avg = (double) sum/num.length;
        System.out.println("average: "+ avg);
    }
}