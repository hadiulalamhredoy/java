
package begginnerjava;

import java.util.Scanner;

public class lettergrade {
    
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        int mark;
        
        System.out.print("Enter Your Marks : ");
        mark = input.nextInt();
        
        if(mark>100 || mark<0){
            System.out.println("Invalid Marks");
            
        }
        
        else if(mark>=80 && mark<=100){
            System.out.println("A+");
            
        }
        
         else if(mark>=80 && mark<=100){
            System.out.println("A+");
            
        }
        
         else if(mark>=75 && mark<=79){
            System.out.println("A");
            
        }
        
         else if(mark>=70 && mark<=74){
            System.out.println("A-");
            
        }
        
         else if(mark>=65 && mark<=69){
            System.out.println("B+");
            
        }
         else if(mark>=60 && mark<=64){
            System.out.println("B");
           
            
        }
        
        else if(mark>=55 && mark<=59){
            System.out.println("B-");
           
        }
        
        
        else if(mark>=50 && mark<=54){
            System.out.println("C+");
           
            
        }
        
        else if(mark>=45 && mark<=49){
            System.out.println("C");
           
            
        }
        
        else if   (mark>=44 && mark<=40){
           
            System.out.println("D");
            
            
        }
        
        else {
            
            System.out.println("F");
        }
        
    }
    
}