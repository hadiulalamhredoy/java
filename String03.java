package basicjava;
public class String03 {
   public static void main (String [] args){
       
       String country = " Bangladesh is   mycountry"; 
       System.out.println(country); 
    
       String s3 = country.trim(); 
       System.out.println(s3); 
      
      char ch = country.charAt(0); 
      System.out.println("ch "+ch); 
      
      int vaule = country.codePointAt(0);
      System.out.println("vaule = "+vaule); 
  
      int pos = country.indexof("is");
      System.out.println("first position of n = "+pos); 
     
      pos = country.lastIndexOf('n');
      System.out.println("last position of n = "+pos);
     
   }
}