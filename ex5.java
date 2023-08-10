//Write a Java program that takes two numbers as input and display the product of two numbers
import java.util.Scanner;
public class ex5 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = is.nextInt();
        System.out.print("enter secound number :");
        int b = is.nextInt();
        System.out.println("product of two number is : "+(a*b));
    }
}
