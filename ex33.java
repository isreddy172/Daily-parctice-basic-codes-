//Write a Java program and compute the sum of the digits of an integer.
import java.util.Scanner;

public class ex33 
{
    public static void main(String... args)
    
    {
        Scanner is = new Scanner(System.in);
        System.out.print("enter a number");
        long a = is.nextInt();
        System.out.print("sum of two digits is : " + add(a));
    
    
    }
      
    public  static int add(long a)
    {
        int n = 0;
        while (a!=0)
        {
            n += a%10;
            a/=10;
        }
        return n;
    }

    
}
