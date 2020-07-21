package Saim_Class;
import javax.swing.*;
public class facebookUser extends SocialMedia implements Groups{

   private String username;
   private String password;
   private String fullname;
   private int age;
   private int numberOfFriends;

   static {
       platform="Facebook";
   }

   public facebookUser(String username,String password){
       setUsername(username);
       setPassword(password);
       personalurl="Facebook.com/"+username;
       accountLength=0;
   }
   public facebookUser(String username,String password,String fullname){
       this(username, password);
       setFullname(fullname);
   }
   public facebookUser(String username,String password,String fullname,int age,int numberOfFriends){
       this(username, password, fullname);
       setAge(age);
       setNumberOfFriends(numberOfFriends);

   }

    public void setPassword(String password) {
       if(password.contains(username)){
           System.out.println("invalid password");
           password="password";
       }

       this.password = password;
    }
    public String getPassword() {
        return password;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if(age<0){
           System.out.println("invalid age");
           age=0;
       }

       this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
       if(numberOfFriends>0){
           this.numberOfFriends=numberOfFriends;
       }


       this.numberOfFriends = numberOfFriends;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
       boolean isValid=true;
       String check=fullname.replace(" ","");
       for(int i=0;i<fullname.length();i++){
           if(!Character.isLetter(check.charAt(i))){
               isValid=false;
               break;
           }
       }
       if(isValid){
           this.fullname=fullname;
       }else{
           System.out.println("Not valid name");
           this.fullname="no name";
       }


    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean DirectMessage(String username, String message) {
       if(message.isEmpty()) return false;

        System.out.println("sent "+message+" to "+username);
       return false;
    }

    @Override
    public boolean createPost(String body) {
        return false;
    }

    @Override
    public boolean joinGroup() {
        return false;
    }

    @Override
    public boolean leaveGroup() {
        return false;
    }

    @Override
    public void notification(int time) {


    }
}
