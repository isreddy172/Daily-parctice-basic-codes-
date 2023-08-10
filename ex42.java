import java.io.Console;
import java.util.Scanner;
public class ex42
{
    public static void main(String... args)
    {
        Scanner is = new Scanner(System.in);
        Console cons;
        if((cons=System.console())!=null)
        {
            char [] pass = null;
            try{
               pass = cons.readPassword("enter your password:");
               System.out.print("your password is :"+new String(pass));
            }
            finally{
                if(pass!=null)
                {
                    java.util.Arrays.fill(pass,' ');
                }
            }
        }else{
            throw new RuntimeException("you are wrong");
        }
    }
}