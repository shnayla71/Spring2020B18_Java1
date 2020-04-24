package day19_Arrays;

public class Array_Introduction {
    public static void main(String[] args) {

        //DataType[] variableName={data1, data2, data3}
        int[] scores={70,75,85,90,95,100};
           // index    0, 1, 2, 3, 4, 5
           // retrive: variebleName[index]
        int num1=scores[2];
        System.out.println(num1);//85

        String[] names={"ayla","zuura","rahman","harika"};
     /*
        String name1=names[1];
        System.out.println(name1);//instead of name1 names[1] can write
        */

     for(int i=0;i<=3;i++){
         System.out.println(names[i]);
     }


    }
}
