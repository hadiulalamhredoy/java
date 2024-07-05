
package begginnerjava;

import java.util.Scanner;1
public class rigthtriangle {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Enter the vaule of a : ");
        a = input.nextInt();
        
        System.out.print("Enter the vaule of b : ");
        b = input.nextInt();
       
        System.out.print("Enter the vaule of c : ");
        c = input.nextInt();
        
        if(a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b){
            
            System.out.println("Rigth Triangle");
        }
        
        else 
        {
            System.out.println("Not Triangle");
            
        }
    }
    
}
