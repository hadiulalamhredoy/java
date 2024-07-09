
import java.io.*;
import java.util.*;

public class MenuCalculator {
	public static void main(String[] args) throws Exception {
		int a, b, choice;
		
		String s;
		char ch = ' ';
		
		Scanner si = new Scanner(System.in);
				
		a = si.nextInt();
		b = si.nextInt();
		
		while(ch != 'Q') {
			   
			System.out.println("Choose your operation");
			System.out.println("1. Addition \n2. Subtraction");
			
			choice = si.nextInt();
			
			if(choice == 1) {
				System.out.println(a+b);
			}
			else if(choice == 2) {
				System.out.println(a-b);
			}
			else {
				System.out.println("Invalid choice.");
				
			}
			
			System.out.println("Loop Input");
			InputStreamReader r = new InputStreamReader(System.in);    
		    BufferedReader br = new BufferedReader(r);            
		    System.out.println("Enter your Loop Input");    
		    s = br.readLine(); 
		    ch = s.charAt(0);
			
		}
	}
}
