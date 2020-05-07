package day35_Static;

public class StaticVariables2 {
    int insVariable;

    static int StaticVariable;  //

    public static void main(String[] args) {
        StaticVariables2 obj1=new StaticVariables2();
        obj1.insVariable=300;
        obj1.StaticVariable=400;

        StaticVariables2 obj2=new StaticVariables2();


        System.out.println(obj1.insVariable); //300
        System.out.println(obj2.insVariable); // 0 tanimlanmadigi icin
        System.out.println();
        System.out.println(obj1.StaticVariable);//400
        System.out.println(obj2.StaticVariable);//400   // static olunca bir oncekinin degerini aynen alir


        System.out.println(StaticVariables2.StaticVariable);//400 static can be called through class name
        //System.out.println(StaticVariables2.insVariable);     instance can not be called through class name so this is error
    }
}
