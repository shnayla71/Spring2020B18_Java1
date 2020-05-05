package day34_CustomContinue;

public class Carpet {
    double windth;
    double length;
    double unitPrice;
    boolean isPersian;

public double calcCost(){
    double total=(windth+length)*unitPrice;
    // if(ispersian){return total+200;}else{return total}
    return (isPersian)? total+200:total;
}
public void customOrder(double Carpetwindth,double Carpetlength,double CarpetunitPrice,boolean CarpetisPersian){
    windth=Carpetwindth;
    length=Carpetlength;
    unitPrice=CarpetunitPrice;
    isPersian=CarpetisPersian;
}
public String toString(){
    return "windth: "+windth+
            "\nlength: "+length+
            "\nunit:$ "+unitPrice+
            "\nCosts:$ "+calcCost();
}

}
