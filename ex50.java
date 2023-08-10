//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. 
public class ex50
 {
 public static void main(String... atgs)
 {
    int a= 3;
    int b=5;
    System.out.println("divisible by 3");
    for (int i=1;i<=100;i++)
    {
      if(i%a==0)
       {
        
        System.out.print(i+",");
       }
       
    }
    System.out.println("\n divisible by 5");
    for(int i = 0;i<=100;i++)
    {
        if(i%b==0)
        {
         System.out.print(i +",");
        }
 
    }
    System.out.println("\ndivisible by 3 and 5");
    for(int i = 0;i<=100;i++)
    {
        if(i%a==0 && i%a==0)
       {
        System.out.print(i +",");
       }
    }

 }    
}
