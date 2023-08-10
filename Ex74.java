//Write a Java program to test if 10 appears as the first or last element of an array of integers.
// The array length must be broader than or equal to 2. 
import java.util.*;

public class Ex74 
{
    public boolean find(int[] arr)
    {
        int size = arr.length;
        if(size < 2)
        {
            return false;
        }
       if(arr[0]==10 || arr[size-1]==10)
       {
        return true;
       }
       return false;
    }
    public static void main(String...args)
    {
        int[] arr = {10,12,14,34,23,10};
        Ex74 is = new Ex74();
        System.out.println(is.find(arr));
    }
}
