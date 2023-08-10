//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. 
import java.util.*;
public class Ex65 
{
   public static void main(String...args)
   {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int d = a/b;
      int Result = a-(d*b);
      System.out.println(Result);
   }
}
