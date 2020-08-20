package day19_Arrays;

public class Arrays_practice2 {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println(arr.length);//3

        int[] arr2=new int[5];

        System.out.println(arr2[0]);

        String[] Testers=new String[3];//{ "Reem","madina","osman"}
        Testers[0]="Reem";

        System.out.println(Testers[0]);// write reem
        System.out.println(Testers.length);// write 3
        System.out.println("======================");

        String[] students=new String[5];
        // write program that enter a name 10 times,each name in the array student
        String[] students1={"a","b","c","d","e"};
        for(int i=0;i<= students1.length;i++){
            for(int j=0;j<= students1.length;j++){
                System.out.println(students1[j]);
            }
        }





    }
}
