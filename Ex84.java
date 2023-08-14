//Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. 
//String length must be greater than three and more. 
public class Ex84
{
   public static void main(String...args)
   {
     
       String a = "ind";
       if(a.length()>3)
       {
        System.out.println("string length is less than 3");
       }
       else
       { 
       String sub = a.substring(a.length()-3);
       System.out.println(sub+a+sub);
       }
   }
}
