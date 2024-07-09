package basicjava;
public class Stringpart01 {
    
   public static void main(String [] args){
       
       String s1 = "Lubaba Bintay Nehal";
       String s2 = new String("Lubaba Bintay Nehal");
       
       System.out.println("s1 = "+s1);
       System.out.println("s2 = "+s2);
       
       
       
       int len = s1.length();
       
       System.out.println("Length of s1 = "+len);
       
       boolean con = s1.contains("Bintay");
       
       System.out.println(con);
       
       boolean b = s1. isEmpty();
       
       System.out.println("b = "+b);
       
       
       
       
   } 
    
}
