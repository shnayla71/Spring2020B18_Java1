package officeHours;

public class replit_56 {
    public static void main(String[] args) {
        String word="fifteen";
        int middle=word.length()/2;
        String result1=""+ word.charAt(middle-1)+word.charAt(middle)+word.charAt(middle+1);
        if(word.length()>=5 && word.length()%2 != 0)
        {System.out.println(result1);}
        else if(word.length()==0){System.out.println("invalid");}

       String word1="$";
        int i=word1.length();
        System.out.println(i);

    }
}
