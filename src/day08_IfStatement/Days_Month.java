package day08_IfStatement;
/* 28 day=2
   30 day =4,6,9,11
   31 day = 1,3,5,7,8,10,12 month must be given month = 3

 */
public class Days_Month {
    public static void main(String[] args) {
     byte month = 3;
     boolean days28 = month==2;
     boolean days30 = month==4 || month ==6 || month==9 || month ==11;
     boolean days31 = days28==false && days30==false;
     if(days28){System.out.println("It has 28 days");}
     if(days30){System.out.println("It has 30 days");}
     if(days31){System.out.println("It has 31 days");}
   System.out.println("======================" );
      byte months= 4;
      String result = " ";
      if( months==1){ result="jaunary has 31 days";}
      else if (months==2){ result=" february has 28 or 29 days";}
      else if (months==3){ result=" march has 31 days";}
      else if (months==4){ result=" april has 30 days";}
      else if (months==5){ result=" may has 31 days";}
      else if (months==6){ result=" june has 30 days";}
      else if (months==7){ result=" july has 31 days";}
      else if (months==8){ result=" august has 30 days";}
      else if (months==9){ result=" september has 31 days";}
      else if (months==10){ result=" october has 30 days";}
      else if (months==11){ result=" november has 31 days";}
      else if (months==12){ result=" december has 30 days";}
      else { result=" invalid";}
      System.out.println(result);








    }
}
