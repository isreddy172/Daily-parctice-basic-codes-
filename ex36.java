   /*Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25 
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km  */
import java.util.Scanner;
class ex36 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);
        System.out.print("enter x1");
        double x1 = is.nextInt();
        System.out.print("enter x2");
        double x2 = is.nextInt();
        System.out.print("enter y1");
        double y1 = is.nextInt();
        System.out.print("enter y2");
        double y2 = is.nextInt();
        System.out.println("distance between two points are: "+distance(x1,x2,y1,y2));
    }
    public static double distance(double x1,double x2, double y1,double y2)
    {
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double radius = 6371.01;
        return radius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
    }
}