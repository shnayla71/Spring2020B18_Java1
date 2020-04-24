package day19_Arrays;

public class Frequency_2 {
    public static void main(String[] args) {
        String str="AABACBC";
        String result="";
        String nonDuplicate="";//ABC find occured

        for(int i=0;i<=str.length()-1;i++){
            if(!nonDuplicate.contains(""+str.charAt(i))){
                nonDuplicate += str.charAt(i);
            }
        } System.out.println(nonDuplicate);

        for(int j=0;j<=nonDuplicate.length()-1;j++){
            nonDuplicate.charAt(j);

        int count=0;//count the total number of occurence of each character
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='A'){
                count++;
            }
        }
        result+= ""+nonDuplicate.charAt(j)+count;}

        System.out.println(result);//A2




    }
}
