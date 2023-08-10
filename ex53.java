// Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. f
import java.util.*;
public class ex53
{
   public static void main(String... args)
   {
      Scanner is = new Scanner(System.in);
      System.out.print("enter first number :");
      int a = is.nextInt();
      System.out.print("enter secound number :");
      int b = is.nextInt();
      System.out.print("Enter third number :");
      int c =is.nextInt();
      System.out.print("final resulst is :"+test(a,b,c,true));
   }
   public static boolean test(int x,int y,int z,boolean abc)
   {
      if(abc)
      return(y>x);
      return(y>x && x>y);
   }

}
