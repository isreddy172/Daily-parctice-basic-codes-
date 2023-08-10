//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;
public class ex12 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);
        System.out.print("enter first nember ");
     double a = is.nextInt();
        System.out.print("enter secound nember ");
        double b = is.nextInt();
        System.out.print("enter third  nember ");
    double  c = is.nextInt();
        System.out.print("average of three numbers are : " + ((a+b+c)/2));
    }
}
