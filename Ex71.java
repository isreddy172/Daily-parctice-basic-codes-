//Write a Java program to create the concatenation of the two strings except removing 
//the first character of each string. The length of the strings must be 1 and above. 
public class Ex71
{
public static void main(String...args)
{
    String s1 = "cIndra";
    String s2 = "senareddy";
    String sub = s1.substring(1);
    String sub2 = s2.substring(0);
    System.out.println(sub+sub2);

}    
}
