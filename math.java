
package begginnerjava;

public class math {
    
    
    public static void main(String[] args){
        
     
     int x = 2;
     int y = 4;

         
     int max = (Math.max(x,y));
     System.out.println("Maximum : "+max);
 
 
          int min = (Math.min(x,y));
          System.out.println("Minimum : "+min);

        int absolute = Math.abs(y);
        System.out.println("Absolute vaule of y  : "+absolute);


           double power = Math.pow(x,y);
         System.out.println("x to the Power y : "+power);

        int round = Math.round(8.4f);
       System.out.println("Round of 8.4 : "+round);

         double pi = Math.PI;
           System.out.println("pi : "+pi);

   
        
        
    }
    
}
