//Write a Java program to rotate an array (length 3) of integers in the left direction. 
public class Ex79{
    public static void main(String...args)
    {
       int[] arr = {2,4,5,20};
       int[] arr1 = new int[arr.length];
       for(int i=1;i<arr.length-1;i++)
       {
        arr1[i]  = arr[arr.length-1];
        // arr1[i]= arr[i];
        // arr1[i] = arr[0];
        System.out.println(arr1[i]);
       }
     
    }
}
