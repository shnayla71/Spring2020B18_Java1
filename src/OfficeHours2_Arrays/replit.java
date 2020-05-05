package OfficeHours2_Arrays;

public class replit {
    public static void main(String[] args) {
        String target="bali";
        String word="lokma";
        String result="";
        if(target.length()<4){
           result=  target.substring(0,target.length()-1)+word;
        }else{

            result= (target.substring(0,3)+word+target.substring(3));

        }
        System.out.println(result);


        String text="aysecik";
        int maxlength=3;
        String str= text.substring(0,maxlength);
        System.out.println(str);



    }
}
