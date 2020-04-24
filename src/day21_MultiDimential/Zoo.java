package day21_MultiDimential;

public class Zoo {
    public static void main(String[] args) {
        String[] wild={"tiger","lion","monkey","turtle"};
        String[] bird={"eagle","duck","peacock","chicken"};

        String[][] zoo={wild,bird};
        String kfc=zoo[1][3];
        System.out.println(kfc);// chicken

        for(String each:zoo[1]){
            if(each.equals("chicken")){
                continue;
            }
        System.out.println(each);}

for(String each1:zoo[0]){
    if(each1.equals("turtle")){
        continue;
    }
    System.out.println(each1);
}




















    }
}
