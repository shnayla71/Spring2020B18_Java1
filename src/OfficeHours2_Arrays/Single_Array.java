package OfficeHours2_Arrays;

import java.util.Arrays;

public class Single_Array {
    public static void main(String[] args) {
        int a=100;
        int[] arr={100,200,300};
        System.out.println(arr[1]);

        for(int i=0; i<3;i++){
            //System.out.println(i);
            int num= arr[i];
            System.out.println(num);
        }
        int j=0;
        while(j<3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }

         String[] names={"John","Aaron","Louise"};
         int length=names.length;
        String[] namesRev = new String[length];//{null,null,null}
            //       i        k
            namesRev[0]=names[2];
            namesRev[1]=names[1];
            namesRev[2]=names[0];

            int k=2;// length-1
            for(int i=0;i<length;i++){
                namesRev[i]=names[k];
                k--;
            }
            int i=0;
            int l=length-1;
            while(i<length){
                namesRev[i]=names[l];
                i++;
                l--;
            }

        System.out.println(Arrays.toString(namesRev));




    }
}
