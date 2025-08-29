// File : FindMaxInArray.java

public class FindMaxInArray{

    public static void main(String[]args) {

        int[] num = {2,3,6,4,8,};
        int max = num[0];

        for(int i=1; i< num.length; i++){
            if(num[i]> max){
                max=num[i];
            }
        }
        System.out.println("Maximum value: "+max);


    }
}