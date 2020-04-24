package day23_CustomMethod;

public class Custom_Methods {
    public static void main(String[] args) {
        printHello5Times();
        evenNumbers();
        oddNumbers();
    }
 public static void printHello5Times(){
        for(int i=0;i<5;i++){
            System.out.println("hello world");
        }
 }

public static void evenNumbers(){
        for(int i=1;i<=100;i++){
            if(i%2 == 0){
                System.out.print(i+ " ");
            }
        }
    System.out.println();
}

public static void oddNumbers(){
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    System.out.println();
}




}
