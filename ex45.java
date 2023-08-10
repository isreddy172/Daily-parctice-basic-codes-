// Write a Java program to find the size of a specified file
import java.io.File;
import java.util.Scanner;
public class ex45 {
    public static void main(String... args)
    {
        System.out.println("/Users/indra/Desktop/indra.jpeg : " + new File("indra.jpeg").length() + " bytes");
        System.out.println("/indra/class/text.txt : " + new File("text.txt").length()+"bytes");
    }
}