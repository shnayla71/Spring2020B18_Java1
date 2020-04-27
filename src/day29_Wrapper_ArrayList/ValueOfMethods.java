package day29_Wrapper_ArrayList;
import java.util.Arrays;
public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";
        Integer a=Integer.valueOf(str); //123
        System.out.println(a);

        double b=Integer.valueOf(str);
        System.out.println(b);//123.0

        String str2="15.5";
        double d1=Double.parseDouble(str2);
        // double=double//none
        double d2=Double.valueOf(str2);
       // double=Double // unboxing
        System.out.println(d1);// 15.5
        System.out.println(d2);//15.5
        System.out.println("=====================================");

        Short sh1=3000;
        int z2=sh1;
          int i=100;//we can not do like this
       // Long l=i;
       String r1="true";
       Boolean t1=Boolean.valueOf(r1);

       boolean t2=Boolean.valueOf(r1);
       //  unboxing

        System.out.println("========================");
        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);// int in max degerini doner

        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int min=Integer.MIN_VALUE;
        System.out.println(min);

        byte maxNum3=Byte.MAX_VALUE;
        System.out.println(maxNum3);
        System.out.println("====================");

        int[] arr=new int[3];
        System.out.println(Arrays.toString(arr));

         Boolean[] arr1=new Boolean[3];
        System.out.println(Arrays.toString(arr1));
        // returns null,null,null
        String[] arr2={"1","2.5","3","4.5"};
        double [] arr3 ={1,2.5,3,4.5};
         double max=Double.MIN_VALUE;
        for(String each:arr2){
            double num=Double.valueOf(each);
            if(num>max){
                max=num;
            }
        }
        System.out.println(max);

        String[] arr4={"1","2.5","3","4.5"};
        double[] numbers=new double[arr4.length];

        for(int j=0;j<arr4.length;j++) {


            numbers[j] = Double.parseDouble(arr4[j]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);






    }
}
