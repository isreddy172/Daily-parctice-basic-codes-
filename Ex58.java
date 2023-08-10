//Write a Java program to capitalize the first letter of each word in a sentence. 
import java.util.Scanner;
class Ex58 {
 public static void main(String...args)
 {
    Scanner is = new Scanner(System.in);
    String a = is.nextLine();
    Scanner b = new Scanner(a);
    String uppercase = " ";
    while(b.hasNext())
    {
        String d = b.next();
        uppercase += Character.toLowerCase(d.charAt(0))+d.substring(1)+" ";
    }
    System.out.println(uppercase);
 }   
}