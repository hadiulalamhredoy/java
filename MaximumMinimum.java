
package begginnerjava;
import java.util.Scanner;

public class MaximumMinimum {
    
    public static void main(String []args){
        
       Scanner input =  new Scanner(System.in);
     int num1,num2;
       
       System.out.println("Enter num1 : ");
       num1=input.nextInt();     
       System.out.print("Enter num2 : ");
       num2 = input.nextInt();
       
       if (num1>num2){
           
           System.out.println("Maximum");
                
       }
      
       else if (num1<num2){
           
           System.out.println("Minimum");
           
       }
        
       else {
           
           System.out.println("Not equal");
       }
       
       
        
    }
    
}
