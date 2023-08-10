// Write a Java program to print the area and perimeter of a circle.
/*Radius = 7.5 
Expected Output
Perimeter is = 47.12388980384689 
Area is = 176.71458676442586*/
import java.util.Scanner;
import java.math.*;
class ex11 {
    public static void main(String... args)
    {

        Scanner is = new Scanner(System.in);
        double r = 7.5;
        double area = Math.PI*r*r;
        double perimeter = 2* Math.PI*r;
        System.out.println("area of circle is :"+area);
        System.out.println("perimeter of circle :" + perimeter );
    }
}