//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. 
import java.util.*;
public class ex52 {
    public static void main(String... args)
    {
        Scanner is = new Scanner (System.in);
    System.out.print("enter first number :");
     int a = is.nextInt();
     System.out.print("enter secound  number :");
     int b = is.nextInt();
    System.out.print("enter third number :");
    int c = is.nextInt();
     System.out.print("resylt is :"+add(a,b,c));
     
    }
    public static boolean add(int x, int y, int z )
    {
       
        return((x+y)==z|| (y+z)==x||(z+x)==y);
        
    }

    
}
//return((a+b)==c|| (b+c)==a||(c+a)==b);
