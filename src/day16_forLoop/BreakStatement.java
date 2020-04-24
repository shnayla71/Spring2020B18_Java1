package day16_forLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            // if(i==3){break; it writes 2 times
            System.out.println("hello world");
            //break;// only one time write hello world
            if(i==3){break;
        }}

        for(char i='a';i<='z';i++){
            //if(i=='e'){break;}same thing
            System.out.println(i);
            if(i=='d'){break;}
        }








    }
}
