//Write a Java program to convert a string to an integer in Java
import java.util.Scanner;
class ex51
{
   public static void main(String...args)
   {
    Scanner is = new Scanner(System.in);
    System.out.print("enter a string:");
    String a = is.nextLine();
    int b = Integer.parseInt(a);
    System.out.print(a);
   }
}