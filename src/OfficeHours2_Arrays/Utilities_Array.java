package OfficeHours2_Arrays;

import java.util.Arrays;

public class Utilities_Array {
    public static void main(String[] args) {
        int[] arr={9,10,8,65,6,5,20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] salaries={10000,200000,300,4000,678,85930,2000 };
        int length=salaries.length;
        int lastIndeks=length-1;
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("min salaries: "+salaries[0]);
        System.out.println("max salaries: "+salaries[lastIndeks]);






    }
}
