package Saim_Class;

public abstract class SocialMedia {
    protected String personalurl;
    protected int accountLength;
    protected static String platform;

    public abstract boolean DirectMessage(String username,String message);
    public abstract boolean createPost(String body);
    public abstract void notification(int time);
}
