//Write a Java program to check whether Java is installed on your computer.
/*
we can find all this using System.out.print(Sytem("java.version"))
Java Version: 1.8.0_71                                                            
Java Runtime Version: 1.8.0_71-b15                                                
Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
Java Vendor: Oracle Corporation                                                   
Java Vendor URL: http://Java.oracle.com/ 
Java Class Path:    */
class ex31 {
    public static void main(String... args)
    {
        System.out.println("java Version"+System.getProperty("java.version"));
        System.out.println("java Home"+System.getProperty("java.home"));
        System.out.println("java Vendor"+System.getProperty("java.vendor"));
        System.out.println("java vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("java class path"+System.getProperty("java.class.path"));
    }
}