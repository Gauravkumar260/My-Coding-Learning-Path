// File : SearchMaxAndIndex.java

public class SearchMaxAndIndex{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};

        int max = arr[0];
        int index = 0;

        for (int i =1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;

            }
        }
        System.out.println("Max value: "+ max);
        System.out.println("Index: "+ index);
    }
}