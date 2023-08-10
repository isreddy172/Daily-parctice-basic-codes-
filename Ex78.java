//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7


public class Ex78
{
    boolean contain(int[] arr1)
    {
 for(int i=0;i<arr1.length;i++)
    {
        if(arr1[i] == 4 || arr1[i] ==7)
        {
            return true;
        }
        
    }
    return false;
    }
public static void main(String...args)
{
    int[] arr1 = {1,2,4};
  
   Ex78 is = new Ex78();
   System.out.println(is.contain(arr1));

}
}
    
