//Write a Java program to rotate an array (length 3) of integers in the left direction. 

import java.util.*;

public class Ex79{
    public static void main(String...args)
    {
       int[] arr = {2,4,5};
       int[] c ={arr[arr.length-1],arr[1],arr[0]};
       System.out.println(Arrays.toString(c));
    }
}
