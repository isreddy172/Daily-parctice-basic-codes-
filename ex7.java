//Write a Java program that takes a number as input and prints its multiplication table upto 10.
import java.util.Scanner;

public class ex7 {
    public static void main(String... args)
    {
        Scanner is = new Scanner (System.in);
        System.out.print("enter first number : ");
        int a = is.nextInt();
  
       
        for(int i=1;i<=10;i++)
        { 
        System.out.println(a+"x"+i+"="+(a*i));
        }
    }
    
}
