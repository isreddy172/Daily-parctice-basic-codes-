/*Write a Java program to compute the area of a hexagon
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side*/
import java.util.Scanner;
import java.math.*;
public class ex34 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);         
    
        System.out.print("enter the side of the hexagon : ");
       double s = is.nextLong();
       double area = (6 * s*s)/(4* Math.tan(Math.PI/6));
       System.out.print(area);
    }
    
}
