import java.util.*;
import java.util.Arrays;
public class Ex61 {
   public static void main(String...args)
   {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
     char[] c = a.toCharArray();
     for(int i = c.length-1;i>=0;i--)
     {
        System.out.print(c[i]);
     }

   }
}
/*import java.util.*;
 public class Ex61 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("\nInput a word: ");
	 String word = in.nextLine();
	 word = word.trim();
	 String result = ""; 
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 }			
}*/

