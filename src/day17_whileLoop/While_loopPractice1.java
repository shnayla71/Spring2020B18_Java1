package day17_whileLoop;

public class While_loopPractice1 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
        int sum=0;
        int i=0;
        while(i<=10){
            if(i%2 ==0){
             sum += i;   //System.out.println(i);
            }
            i++;
        }System.out.println(sum);



















    }
}
