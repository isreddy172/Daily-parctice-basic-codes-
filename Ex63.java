//Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6. 
import java.util.*;

class Ex63
{
    public int statment(int a,int b)
    {
        if(a==b)
        
            return 0;
            if(a%6 == b%6)
            
                return (a<b)?a:b;
            
            return (a>b)?a:b;
        

    }

   public static void main(String...args)
   {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     Ex63 is = new Ex63();
     System.out.println(is.statment(a, b));

     
   }
}