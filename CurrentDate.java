
package datedemo;

import java.util.Date;


public class CurrentDate {
  
     public static void main(String [] args){
    
    Date date = new Date();
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
    String currentDate =  dateFormat.format(date);
    System.out.println("Cureent date :  "+currentDate);
    
    
    
   }
    
    
    
    
}
