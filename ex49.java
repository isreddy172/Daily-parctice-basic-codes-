//Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
import java.util.Scanner;
public class ex49 
{
  public static void main(String... args)
  {
    Scanner is = new Scanner(System.in);
    System.out.print("enter any number :");
    int a = is.nextInt();
    if(a%2==0)
    {
        System.out.print("1");
    }else{
        System.out.print("0");
    }
  }    
}
