
package begginnerjava;
import java.util.Scanner;
public class pattern01 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the line numbers : ");
        int n = input.nextInt();
        
        for (int row =1; row<=n; row++){
            
            for (int col =1; row<=n; col++){
                
                System.out.print(" "+col);
            }
              System.out.printrln();
            
        }
        
        
        
        
        
    }
    
    
}
