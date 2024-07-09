
package javaapplication1;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class XORmissingNumber {
    public static void main(String[] args) {
        int x1 , x2, n;
      
        Scanner si = new Scanner(System.in);
        
        try{
           System.out.println("Provide the size of array");
            //Input for the length of array n
            n = si.nextInt();

            int[] arr = new int[n];

            //Loop for array input till n-1 values
            System.out.println("Give input n-1 values");
            for (int i = 0; i < n - 1; i++) {
                arr[i] = si.nextInt();
            }
            
            x1 = arr[0];
            x2 = 1;
            
            // XOR for the values
            for(int i = 1; i < n-1; i++ ){
                x1 = x1^arr[i];
            }
            
            // XOR for the ranges
            for(int i = 2; i <= n; i++ ){
                x2 = x2^i;
            }
            
            System.out.println("Missing Element is "+ (x1^x2));
        
        }catch(Exception e){
            System.out.println("Error name: " + e);
        }
       
        System.out.println("Terminated without any error");
    }
    
}
