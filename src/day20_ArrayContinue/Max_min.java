package day20_ArrayContinue;

public class Max_min {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){// array's index are compared with each other
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
            System.out.println(max);
            System.out.println(min);








    }
}
