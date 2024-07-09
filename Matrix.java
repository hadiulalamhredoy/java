
package basicjava;

import java.util.Scanner;
public class Matrix {
    
    public static void main(String [] args){
        Scanner input =  new Scanner (System.in);
        int [] [] A = new int [3] [3];
        int sumofDiagonalElements = 0;
        int sumofUpperElements = 0;
        int sumoflowerElements = 0;
        
         for (int row =0 ;  row<3;  row++){
           
         for (int col =0; col<3; col++){
             
        
         A [row][col] = input.nextInt();
            }
       }
        for (int row =0 ;  row<3;  row++){
           
         for (int col =0; col<3; col++){
        
        
            if (row==col)
            {
                
                sumofDiaogonalElements = sumofDiaogonalElements + A[row] [col];
             
            } 
             
            if(row<col)
            {
                  sumofUpperElements = sumofUpperElements + A[row] [col];
                
            }
                
            if (row>col)
            {
            
                sumofLowerElements = sumoflowerElements + A[row] [col];
                
                
            }
            } 
            
         }
             
     System.out.println("Sum of diaogonal elements : "+sumofDiaogonalElements);
     System.out.println("Sum of upper elements : "+sumofUpperElements);
     System.out.println("Sum of lower elements : "+sumofLowerElements);
    
      
   
   

}
    
    
}
