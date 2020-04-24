package OfficeHours_loop;

public class Practice_01 {
    public static void main(String[] args) {

        for(int i=0;i<=100;i++){
            if(i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }

      String name="ayla";
        String s="";
        int last=name.length()-1;
        for(int i=last;i>=0;i--){
            s=s+name.charAt(i);
        }System.out.println(s);








    }
}
