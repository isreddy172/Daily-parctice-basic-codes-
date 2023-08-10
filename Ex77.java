//Write a Java program to create an array of length 2 from two integer arrays with three elements. 
//The newly created array will contain the first and last elements from the two arrays. 
import java.util.*;
public class Ex77
{
   public static void main(String...args)
   {
      int[] arr1 = {2,4,3};
      int[] arr2 = {6,4,7};
      int[] arr3 = {arr1[0],arr2[arr2.length-1]};
      System.out.println(Arrays.toString(arr3));
   
      
   }    
}
