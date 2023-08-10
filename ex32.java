import java.util.Scanner;

public class ex32 {
   public static void main(String... args)
   {
    Scanner is = new Scanner(System.in);
    System.out.print("enter any number :");
    int a = is.nextInt();
    System.out.print("enter secound number : ");
    int b = is.nextInt();
   
    if(a!=b)
   {
    System.out.println(a+"!="+b);
   }
   if(a==b)
   {
    System.out.println(a+"=="+b);
   }
   if(a<b)
   {
    System.out.println(a+"<"+b);

   }
   if(a>b)
   {
    System.out.println(a+">"+b);
   }
   if(a<=b)
   {
    System.out.println(a+"<="+b);

   }
   if(a>=b)
   {
    System.out.println(a+">="+b);

   }
}
}