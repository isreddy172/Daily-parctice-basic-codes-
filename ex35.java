/*Write a Java program to compute the area of a polygon
 Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
*/
import java.util.Scanner;
import java.math.*;
public class ex35 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);         
    
        System.out.print("enter the side of the hexagon : ");
       double s = is.nextLong();
       System.out.print("length of one side is :");
       double n = is.nextLong();

       double area  = (n*(s*s))/(4*Math.tan(Math.PI/n));
       System.out.print(area);
    }
    
}
