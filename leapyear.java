
package begginnerjava;

import java .util.Scanner;
public class leapyear {
    
    public static void main(String[] args){
        
       Scanner input =  new Scanner(System.in);
        int year;
       System.out.print("Enter Year : ");
       
       year = input.nextInt();
       
       if(year%400==0){202
           
          System.out.println("Leap Year");
           
       }
        
     
       else if (year%4==0 && year%100!=0){
           
           System.out.println("Leap year");
       }
       else
       {
           System.out.println("not a year");
           
       }       
       
    }
    
}
