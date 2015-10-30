package core.java2.v1ch2;

public class Welcome {
    public static void main(String[] args)
    {
        String[] greeting = new String[3];
        greeting[0] = "Welcome to Core Java";
        greeting[1] = "by Cay Horstmann";
        greeting[2] = "and Gary Cornell";

        for (int i = 0; i < greeting.length; i++)
            System.out.println(greeting[i]);
    }
}
