// File : FindMinInArray.java

public class FindMinInArray{
    public static void main(String[]args){
        int[] num = {9,3,4,8,5,};
        int min = num[0];
        for(int i=1; i< num.length; i++){
            if (num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Minmum value: "+ min);
    }
}