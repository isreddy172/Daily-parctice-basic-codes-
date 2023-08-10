//Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above. 
import java.util.*;
public class Ex68
{
 public static void main(String...args)
 {
    String s = "python 3.0";
    String sub = s.substring(s.length()-3);
    for(int i = 0;i<4;i++)
    {
        System.out.print(sub);
    }


 }  
}
