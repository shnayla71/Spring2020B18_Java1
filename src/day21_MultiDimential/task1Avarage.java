package day21_MultiDimential;

import java.text.DecimalFormat;
import java.util.Arrays;

public class task1Avarage {
    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");

        int[] nums={10,22,37,40,53};
        double sum=0;
        double length=nums.length;
        for(int i=0;i<=length-1;i++){
            sum+=nums[i];
        }
         double average=sum/length;
        System.out.println(DF.format(average));

//System.out.println(5/(double)3)=> gives 1.6666





    }
}
