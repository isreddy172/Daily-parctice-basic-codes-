//Write a Java program to test if the first and last element of two integer arrays are the same. 
//The array length must be greater than or equal to 2.
import java.util.*;
public class Ex76
{
  public static void main(String...args)
  {
    int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {1,2,45,6};
    System.out.println(arr1.length >=2 && arr2.length>=2 && arr1[0] == arr2[0] && arr1[arr1.length-1]==arr2[arr2.length-1]);
    if(arr1.length >=2 && arr2.length>=2)
    {
       System.out.print(arr1[0] == arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]);
    }
    else
    {
        System.out.print("array length is grater than 2");
    }
  } 
}