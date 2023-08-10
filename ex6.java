//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;

public class ex6 {
 public static void main(String... args)
  {
    Scanner is = new Scanner(System.in);
    System.out.print("enter first nubmer :");
    int a = is.nextInt();
    System.out.print("enter secound nubmer :");
    int b = is.nextInt();
    System.out.println("sum of two numbers is : "+(a+b));
    System.out.println("sum of two numbers is : "+(a*b));
    System.out.println("sum of two numbers is : "+(a-b));
    System.out.println("sum of two numbers is : "+(a/b));
    System.out.println("sum of two numbers is : "+(a%b));




  }   
}
