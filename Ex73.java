//Write a Java program to create a string taking the first and last characters from two given strings.
// If the length of each string is 0 use "#" for missing characters. 
import java.util.*;
public class Ex73
{
   public static void main(String...args)
   {
      String s1 = "python";
      String s2 = " ";
      String sub1 = s1.substring(0,1);
      String sub2 = s2.substring(s2.length()-1);
      if(sub2 == " ")
      {
        System.out.println(sub1+"#");
      }
      else 
      {
        System.out.println(sub1+sub2);
      }
   

   }
}
