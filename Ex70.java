//Write a Java program to create a string in the form of short_string + long_string + short_string 
//from two strings. The strings must not have the same length. 
import java.util.*;
public class Ex70
{
    public static void main(String...args)
    {
        String s1 = "python";
        String s2 = "Toturial";
        int a = s1.length();
        int b= s2.length();
        if(a > b)
        {
            System.out.println(s2 + s1 + s2);
        }
        else 
        {
            System.out.println(s1+s2+s1);
        }
    }
}
