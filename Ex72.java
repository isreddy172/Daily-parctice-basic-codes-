// Write a Java program to create a string taking the first three characters from a given string. 
//If the string length is less than 3 use "#" as substitute characters. 
import java.util.*;
public class Ex72
{
   public static void main(String...args)
   {
      String s1 = "";
      int len = s1.length();
      if(len >=3)
      {
        System.out.println(s1.substring(0, 3));
      }else if(len == 1)
      {
        System.out.println(s1.charAt(0)+"##");
      }
      else
      {
        System.out.println("###");
      }
   

   }
}
