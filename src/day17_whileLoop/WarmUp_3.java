package day17_whileLoop;

public class WarmUp_3 {
    public static void main(String[] args) {
        String result="";
        for(int i=1;i<=30;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //  System.out.println("FINRA");}
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            }
            //System.out.println("FIN");}
            else if (i % 5 == 0) {
                result += "RA ";
            }
            //System.out.println("RA");}
            else {
                result += i + " ";
            }
            //System.out.println(i);}
        }System.out.println(result);

























    }
}
