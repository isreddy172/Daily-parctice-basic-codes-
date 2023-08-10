//Write a Java program to multiply the corresponding elements of two integer arrays. 

import java.util.Arrays;

public class Ex83 
{
 public static void main(String...args)
 {  
    String result = " ";
    int arr1[] = {1,4,2,6};
    int arr2[] = {4,2,5,6};
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    for(int i=0;i<arr1.length;i++)
    {
         int a = arr1[i];
         int b = arr2[i];
         result += Integer.toString(a*b)+" ";
    }
    System.out.println(result);
 }   
}
