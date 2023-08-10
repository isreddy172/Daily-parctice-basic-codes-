//Write a Java program to insert a word in the middle of another string. 
// Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
import java.util.*;
public class Ex67 
{
   public static void main(String...args)
   {
    String a = "python 3.0";
    String b = "world ";
    String c = a.substring(0,7);
    String d = a.substring(7, 10);
    System.out.println(c+b+d);
   }
}
