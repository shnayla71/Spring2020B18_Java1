package day16_forLoop;

public class AaBb_write {
    public static void main(String[] args) {
        String upperCase="";
        String lowerCase="";

        for(char ch='A';ch<='Z'; ch++){
            upperCase += ch;
        }System.out.println(upperCase);

        for(char ch='a';ch<='z'; ch++){
            lowerCase += ch;
        }System.out.println(lowerCase);

        String result="";
        for (int i=0;i<=upperCase.length()-1; i++){
            result += upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";
        }System.out.println(result);

//second solution
        int a=97;
        int A=65;
        String result2="";
        for(int i=0;i<=26;i++){
            char ch=(char)(A+i);//uppercase
            char ch2=(char)(a+i);
            result2 += ch+""+ch2+" ";
        }System.out.println(result2);











    }
}
