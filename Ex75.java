//Write a Java program to test if the first and last elements of an array of integers are the same. 
//The array length must be broader than or equal to 2. 
import java.util.*;

import java.lang.*;
 public class Ex75 {
 public static void main(String[] args)
 {
    int[] arr = {10,12};
    System.out.println(arr.length >=2 && arr[0] == arr[arr.length-1]);
 }
}
