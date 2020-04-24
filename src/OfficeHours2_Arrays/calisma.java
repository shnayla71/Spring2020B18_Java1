package OfficeHours2_Arrays;

import java.util.Arrays;

public class calisma {
    public static void main(String[] args) {

        int[] arr1D = { 1,2,3  };
        //                 0 1 2      0 1 2 3
        int[][] arr2D = { {1,2,3 } , {4,5,6,7}  };
        //                       0           1
        //[index num of 1DArray][index num of elements]


        // {4,5,6,7};
        System.out.println(arr1D);//yanlis yazim toString kullanmali
        System.out.println( arr2D[1] );
        System.out.println(Arrays.toString(arr2D[1]) );


        // 7
        System.out.println( arr2D[1][3]  );

        // 4
        System.out.println( arr2D[1][0]  );


        System.out.println( Arrays.deepToString(arr2D) );



        String[] names = {"John", "Aaron", "Luoise", "Muhtar"}; // 3
        //                  0        1         2        3

        int length = names.length; //3
        String[] namesRev = new String[length];  // {null, null, null}
        //                                            0     1     2
           /*
                //       i          k
                namesRev[0] = names[2];
                namesRev[1] = names[1];
                namesRev[2] = names[0];
              */

           /*
               int k =  length-1;
               for(int i = 0; i < length; i++ ){
                   namesRev[i] = names[k];
                   k--;
               }
        */
        int i =0;
        int k = length-1; // max index number
        while(i < length){

            namesRev[i] = names[k];
            i++;
            k--;
        }


        System.out.println(Arrays.toString( namesRev ) );










    }
}
