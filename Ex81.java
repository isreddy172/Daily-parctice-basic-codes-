// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array. 
public class Ex81
{
 public static void main(String...args)
 {
    int[] arr = {20,30,40};
    int a=arr[0];
    int size = arr.length;
    int b = arr[arr.length-1];
    int temp =0;
  for(int i=0;i<arr.length;i++)
  { temp = arr[0];
     arr[0] = arr[size-1];
     arr[size-1] = temp;
     System.out.print(arr[i]+",");
     
  }
 }
}
