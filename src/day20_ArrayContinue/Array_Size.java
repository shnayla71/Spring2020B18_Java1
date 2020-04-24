package day20_ArrayContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr1={1,2,3};//size 0~2
        //System.out.println(arr1[100]);
        int num[]=new int[2]; // size 2 can be {0,0}
        num[0]=10;
        num[1]=20;
        // num[2]=30; we cannot because array size is 2

      //  num=new int[3];// reset {0,0,0}
        System.out.println(num[0]+1);// it dosenot write 10

    }
}
