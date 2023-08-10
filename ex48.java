//Write a Java program to print the odd numbers from 1 to 99. Prints one number per line
import java.util.Scanner;
public class ex48 {
    public static void main(String... args)
    {
      /*Scanner is = new Scanner(System.in);
      System.out.print("enter any number");*/
      int a = 2;//is.nextInt();
      for(int i=1;i<=100;i++)
      {
        if(i%a==1)
        {
         System.out.println(i);
        }
      }
    }
    
}
