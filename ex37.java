//Write a Java program to reverse a string
import java.util.Scanner;
class ex37 {
   public static void main(String... args)
   {
    Scanner is = new Scanner(System.in);
    System.out.println("enter string");
    char[] letter = is.nextLine().toCharArray();
    for(int i=letter.length-1;i>=0;i--)
    {
        System.out.print(letter[i]);
    }  
   }
}