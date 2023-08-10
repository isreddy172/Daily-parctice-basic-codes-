//Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
import java.util.Scanner;

public class ex39 {
    public static void main(String... args)
    {
    
       int list = 0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {   
                       if(i!=j && i!=k && k!=j)
                        {
                           list++;
                           System.out.println(i + "" + j + "" + k);
                        }   
                }
            }
        }
        System.out.print("ther numbers are :"+list);

    }
    
}
