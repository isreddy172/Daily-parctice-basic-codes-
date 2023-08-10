//Write a Java program to divide two numbers and print on the screen
import java.util.Scanner;
public class ex3 {
    public static void main(String... args)
    {
       Scanner is = new Scanner(System.in);
       System.out.print("enter first number :");
       int a = is.nextInt();
       System.out.print("enter secound number :");
       int b = is.nextInt();
       System.out.println("division of two numbers is :"+(a/b));

    }
}
