package day15_loop;

public class LoopPractice {
    public static void main(String[] args) {
        //odd numbers between 1˜100 in a single line sperate with space
        // 1,3,5,7,9,11........
        String result="";
        for(int num=1;num<=100; num+=2){
            //System.out.print(num+" ");}
        result += num +" ";}
        System.out.println(result);
//even number 2,4,6.........
        String even="";
        for(int n1=2;n1<=100; n1+=2){
            even+= n1+" ";
        }System.out.println(even);




    }




}
