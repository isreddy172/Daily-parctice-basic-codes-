//Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions. 
import java.util.*;


public class Ex62 
{
    public boolean ample(int a,int b,int c)
    {
        if(a-b >= 20 || b-c >= 20 || c-a >=20)
        {
            return true;
        }
        return false;
    }
 public static void main(String...args)
 {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      Ex62  obj = new Ex62();
      System.out.println(obj.ample(a,b,c));
 }

}
/*
 * public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
 */
