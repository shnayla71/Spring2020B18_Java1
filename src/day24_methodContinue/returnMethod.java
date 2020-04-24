package day24_methodContinue;

public class returnMethod {
    public static void maxNum(int a,int b){
        if(a>=b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
       //int a= maxNum(10,20);
       int result= Addition(10,20);// burda ne yazarsa yazsin return degerini doner
        System.out.println(result);
    }

public static int Addition(int a,int b){//int tanimladik cunku adition degere donustu
    //System.out.println(a+b);

     return a+b; // sayi yazarsak sadece onu yazar
    }




}
