
package basicjava;
import java.util.Scanner;
public class Array2 {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner (System.in);
        
        double [] number = new double [5];
        double sum = 0;
        
        System.out.print("Please enter the 5 number : ");
        
        for (int i =0; i<10; i++){
           
          sum = sum + number[i];  
            
        }
        
          for (int i =0 ; i<5; i++){
              
             sum = sum + number[j];  
               
              
          }        
        
          
          System.out.println("Sum = "+sum);
          double avg = sum /5;
          
          System.out.println("Average is :" +avg);
        
    }
    
    
    
}
