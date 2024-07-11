
package basicjava;
public class String05 {
  
    public static void main(String [] args){ 
      String s1 = "Lubaba"; 
      StringBuffer sb = new StringBuffer(s1);
     
     System.out.println(sb); 

     sb.append("Bintay"); 

     sb.append(25); 

     System.out.println(sb); 

     sb.setLength(5); 

     System.out.println(sb); 
}
    
    
    
}
