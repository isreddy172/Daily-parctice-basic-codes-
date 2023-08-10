
//Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers. 
public class Ex80
{
   public static void main(String...args)
   {
    int[] arr = {6,2,4};
   
    
        if(arr[0] > arr[arr.length-1])
        {
            System.out.println(arr[0]);
        }else
        {
            System.out.println(arr[arr.length-1]);
        }
    
   }    
}
