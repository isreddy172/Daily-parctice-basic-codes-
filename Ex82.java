//Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length). 
// public class Ex82{
//     public static void main(String...args)
//     {
//         int[] arr ={1,3,4,6,4,3};
//         int j=arr[arr.length/2-1];
        
//         if(arr[0]>j && arr[0]>arr[arr.length-1])
//         {
//             System.out.println(arr[0]);
//         }
//         else if(j>arr[0] && j>arr[arr.length-1])
//         {
//             System.out.println(j);
//         }
//         else
//         {
//             System.out.println(arr[arr.length-1]);
//         }
//     }
// }
public class Ex82 {
    public static void main(String...args)
    {
      int[] arr ={1,3,4,6,4,3};
      int max = arr[0];
      if(max <arr[arr.length-1])
      {
        max = arr[arr.length-1];
      }
      else if(max < arr[arr.length/2])
      {
        max = arr[arr.length/2];
      }
      System.out.println("max element is "+ max );
    }
}