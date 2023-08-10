//Write a Java program to count the letters, spaces, numbers and other characters of an input string.
import java.util.Scanner;
class ex38
{
    public static void main(String... args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.print("enter the string : ");
        String a =sr.nextLine();
        count(a); 
    }
    public static void count(String x)
    {
        char[] is = x.toCharArray();
        int letter = 0;
        int num = 0;
        int space = 0;
        int others = 0;
        for(int i=0;i<x.length();i++)
        {
            if(Character.isLetter(is[i]))
            {
                letter++;
            }
            else if(Character.isDigit(is[i]))
            {
                num++;
            } else if(Character.isSpaceChar(is[i]))
            {
                space++;
            }
            else 
            {
                others++;
            }
        }
        System.out.println("letters are " +letter);
        System.out.println("numers are " +num);
        System.out.println("space are " +space);
        System.out.println("others are " +others);



    }
}