//Write a Java program to convert seconds to hour, minute and seconds
import java.util.Scanner;
public class ex55 {
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);
        System.out.print("enter the sec :");
        int sec = is.nextInt();
        int S = sec%60;
        int H= sec/60;
        int M=H%60;
        H = H/60;
        System.out.print(H +":"+ M +":"+S);
    }
}