
package basicjava;
public class String02 {
    
   public static void main(String [] args){
       
       String firstName = "Lubaba";
       String lastName = " Oishee";
     
       String fullName = firstName.concat(lastName);
       System.out.println("Full Name = "+fullName);

       
       String upperName = fullName.toUpperCase();
       System.out.println("upper Name :"+upperName);
       
       
        String lowerName = fullName.toLowerCase();
       System.out.println("lower Name :"+lowerName);
       
          
       boolean b = firstName.startsWith("Lub");
       System.out.println("b = "+b);
       
       boolean last =lastName.endsWith("hee");
       
       System.out.println("last = "+last);
       
       
       
       String [] names = {"Lubaba","Samira","Nafisa"};
       
       for (String x : names){        
        System.out.println(x);
       }
       
       
       
       
       
   }
}