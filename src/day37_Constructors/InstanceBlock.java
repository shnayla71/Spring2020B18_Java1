package day37_Constructors;

public class InstanceBlock {
static{
    System.out.println("Static block");// Static block
}
    {
        System.out.println("Instance block1");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();// Instance block

        InstanceBlock obj2=new InstanceBlock();// Instance block
    }
    {
        System.out.println("instance block2");
    }
}
