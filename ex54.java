//Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative
import java.util.Scanner;
public class ex54 {
public static void main(String... args)
{
Scanner is=new Scanner(System.in);
System.out.print("enter first number :");
int a = is.nextInt();
System.out.print("enter secound number :");
int b = is.nextInt();
System.out.print("enter third mumber :");
int c = is.nextInt();
System.out.print("final result is :"+test(a,b,c,true));
}
public static boolean test(int x,int y, int z,boolean abc)
{ 
return((x%10==y%10)||(y%10==z%10)||(z%10==x%10));
}
}
